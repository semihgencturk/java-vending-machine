package controller;

import model.vendingMachine.VendingMachine;
import model.Denomination;
import java.sql.SQLException;

public class VendingMachineController {
    public boolean isProductAvailable(int vendingMachineId, int productStorageUnitNumber) throws SQLException {
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        VendingMachine vendingMachine = vendingMachineDatabaseController.getVendingMachineById(vendingMachineId);

        int productStock = vendingMachine.getProductOnSale().get(productStorageUnitNumber).getProductCountOnStock();
        return productStock > 0;
    }

    public void giveChangeToCustomer(double changeAmount, VendingMachine vendingMachine) throws SQLException {
        VendingMachineDatabaseController vendingMachineDatabaseController = new VendingMachineDatabaseController();
        DenominationDatabaseController denominationController = new DenominationDatabaseController();

        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitCount();

        for (int denominationStorageUnit = totalDenominationStorageUnitNumber; denominationStorageUnit >= 1; denominationStorageUnit--) {

            // Get denomination amounts in the machines to give change to the user
            int denominationId = vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenomination().getDenominationId();
            Denomination denomination = denominationController.getDenominationById(denominationId);
            double denominationAmount = denomination.getDenominationAmount();

            if (denominationAmount <= changeAmount) {
                int denominationPieceToBeGiven = (int) (changeAmount / denominationAmount);
                double amountToBeGiven = denominationPieceToBeGiven * denominationAmount;

                // Calculate the new stock count of given denominations as a change to the user
                int denominationStockBeforeTransaction = vendingMachine.getDenominationOnUsage().get(denominationStorageUnit).getDenominationCountOnUsage();
                int denominationStockAfterTransaction = denominationStockBeforeTransaction - denominationPieceToBeGiven;

                // Update the database according to the new stock count of the denomination
                int vendingMachineId = vendingMachine.getVendingMachineId();
                vendingMachineDatabaseController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationId, denominationStockAfterTransaction);

                // Decrease the given amount from change amount
                changeAmount = changeAmount - amountToBeGiven;
            }
        }
    }
}
