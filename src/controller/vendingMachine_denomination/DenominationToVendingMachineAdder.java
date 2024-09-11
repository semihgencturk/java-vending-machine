package controller.vendingMachine_denomination;

import model.Denomination;
import model.VendingMachine;

public class DenominationToVendingMachineAdder {
    public void addingDenominationToVendingMachine(VendingMachine myVendingMachine, int denominationStorageUnit, Denomination myDenomination, int amount) {
        myVendingMachine.setDenominationsOnUsage(denominationStorageUnit, myDenomination);
        myVendingMachine.setDenominationAvailability(denominationStorageUnit, amount);
    }
}
