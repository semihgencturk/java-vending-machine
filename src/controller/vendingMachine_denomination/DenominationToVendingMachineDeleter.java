package controller.vendingMachine_denomination;

import model.VendingMachine;

public class DenominationToVendingMachineDeleter {
    public void deletingDenominationFromVendingMachine(VendingMachine myVendingMachine, int denominationStorageUnit) {
        myVendingMachine.setDenominationsOnUsage(denominationStorageUnit, null);
        myVendingMachine.setDenominationAvailability(denominationStorageUnit, 0);
    }
}
