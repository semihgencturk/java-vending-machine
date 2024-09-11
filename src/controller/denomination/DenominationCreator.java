package controller.denomination;

import model.Denomination;

public class DenominationCreator {
    public Denomination definingNewDenomination(String myDenominationCurrency, Integer myDenominationAmount){
        Denomination myDenomination = new Denomination();
        myDenomination.setDenominationCurrency(myDenominationCurrency);
        myDenomination.setDenominationAmount(myDenominationAmount);

        return myDenomination;
    }
}
