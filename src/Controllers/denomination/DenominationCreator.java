package Controllers.denomination;

import Models.Denomination;
import static App_data.DenominationTable.denominationTable;

public class DenominationCreator {
    private static DenominationCreator self = null;
    public static DenominationCreator getInstance() {
        if (self == null) {
            self = new DenominationCreator();
        }
        return self; 
    }

    public void denominationCreator() {
        Denomination denomination = new Denomination();
        denominationTable.add(denomination);
    }

    public void denominationCreator(int denominationId, String denominationCurrency, double denominationAmount){
        Denomination denomination = new Denomination();

        denomination.setDenominationId(denominationId);
        denomination.setDenominationCurrency(denominationCurrency);
        denomination.setDenominationAmount(denominationAmount);

        denominationTable.add(denomination);
    }
}
