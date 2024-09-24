package controller;

import model.Denomination;
import model.VendingMachine;
import java.sql.SQLException;

public class VendingMachineController {
    public void giveChangeToCustomer(double changeAmount, VendingMachine vendingMachine) throws SQLException {
        VendingMachineDatabaseController vendingMachineController = new VendingMachineDatabaseController();
        DenominationDatabaseController denominationController = new DenominationDatabaseController();

        // Get the total denomination storage number to give change to the user
        int totalDenominationStorageUnitNumber = vendingMachine.getTotalDenominationStorageUnitNumber();

        for (int denominationStorageUnit = totalDenominationStorageUnitNumber; denominationStorageUnit >= 1; denominationStorageUnit--) {

            // Get denomination amounts in the machines to give change to the user
            int denominationId = vendingMachine.getDenominationsOnUsage().get(denominationStorageUnit);
            Denomination denomination = denominationController.getDenominationById(denominationId);
            double denominationAmount = denomination.getDenominationAmount();

            // Compare the denominations amount and change amount to give change to the user
            if (denominationAmount <= changeAmount) {
                // Calculate how many of the current denomination should be given as a change to user
                int givenDenominationPiece = (int) (changeAmount / denominationAmount);
                // Calculate the given amount to the user
                double givenAmount = givenDenominationPiece * denominationAmount;
                // Decrease the given amount from
                changeAmount = changeAmount - givenAmount;

                // Calculate the new piece of number of given denominations as a change to the user
                int denominationOnUsageAvailabilityBeforeTransaction = vendingMachine.getDenominationsOnUsageAvailability().get(denominationStorageUnit);
                int denominationOnUsageAvailabilityAfterTransaction = denominationOnUsageAvailabilityBeforeTransaction - givenDenominationPiece;

                // Update the database according the new piece of number
                int vendingMachineId = vendingMachine.getVendingMachineId();
                vendingMachineController.updateDenominationOfVendingMachine(vendingMachineId, denominationStorageUnit, denominationId, denominationOnUsageAvailabilityAfterTransaction);
            }
        }
    }
}
