package Controller.denomination;

import Model.Denomination;

public class DenominationUpdater {
    private static DenominationUpdater self = new DenominationUpdater();
    public static DenominationUpdater getInstance() { return self; }

    public void denominationIdUpdater(Denomination denomination, int denominationId) {
        denomination.setDenominationId(denominationId);
    }
    public void denominationCurrencyUpdater(Denomination denomination, String denominationCurrency) {
        denomination.setDenominationCurrency(denominationCurrency);
    };
    public void denominationAmountUpdater(Denomination denomination, int denominationAmount) {
        denomination.setDenominationAmount(denominationAmount);
    };
}
