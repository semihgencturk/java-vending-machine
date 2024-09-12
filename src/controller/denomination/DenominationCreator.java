package controller.denomination;

import controller.vendingMachine.VendingMachineCreator;
import model.Denomination;

public class DenominationCreator {
    private static DenominationCreator self = new DenominationCreator();
    public static DenominationCreator getInstance() { return self; }

    public Denomination definingNewDenomination(String myDenominationCurrency, Integer myDenominationAmount){
        Denomination myDenomination = new Denomination();
        myDenomination.setDenominationCurrency(myDenominationCurrency);
        myDenomination.setDenominationAmount(myDenominationAmount);

        return myDenomination;
    }
}
