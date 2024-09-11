package controller.vendingMachine_denomination;

import model.VendingMachine;

public class DenominationToVendingMachineUpdater {
    public void updatingDenominationInVendingMachine(VendingMachine myVendingMachine, int denominationStorageUnit, int amount) {
        myVendingMachine.setDenominationAvailability(denominationStorageUnit, amount);
    }
}
