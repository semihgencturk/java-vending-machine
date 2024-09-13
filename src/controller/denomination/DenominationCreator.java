package controller.denomination;

import model.Denomination;

public class DenominationCreator {
    private static DenominationCreator self = new DenominationCreator();
    public static DenominationCreator getInstance() { return self; }

    public Denomination denominationCreatorStarter() {
        return Denomination.getInstance();
    }

    public Denomination denominationCreatorStarter(int denominationId, String denominationCurrency, Integer denominationAmount){
        Denomination denomination = Denomination.getInstance();

        denomination.setDenominationId(denominationId);
        denomination.setDenominationCurrency(denominationCurrency);
        denomination.setDenominationAmount(denominationAmount);

        return denomination;
    }
}
