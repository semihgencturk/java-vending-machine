package Controllers.denomination;

import Models.Denomination;

public class DenominationReader {
    private static DenominationReader self = null;
    public static DenominationReader getInstance() {
        if (self == null) {
            self = new DenominationReader();
        }
        return self;
    }

    public int denominationIdReader(Denomination denomination) {
        return denomination.getDenominationId();
    }
    public String denominationCurrencyReader(Denomination denomination) {
        return denomination.getDenominationCurrency();
    }
    public double denominationAmountReader(Denomination denomination) {
        return denomination.getDenominationAmount();
    }
}

