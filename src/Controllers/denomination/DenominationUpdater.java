package Controllers.denomination;

import Models.Denomination;

public class DenominationUpdater {
    private static DenominationUpdater self = null;
    public static DenominationUpdater getInstance() {
        if (self == null) {
            self = new DenominationUpdater();
        }
        return self;
    }

    public void denominationIdUpdater(Denomination denomination, int denominationId) {
        denomination.setDenominationId(denominationId);
    }
    public void denominationCurrencyUpdater(Denomination denomination, String denominationCurrency) {
        denomination.setDenominationCurrency(denominationCurrency);
    }
    public void denominationAmountUpdater(Denomination denomination, double denominationAmount) {
        denomination.setDenominationAmount(denominationAmount);
    }
}
