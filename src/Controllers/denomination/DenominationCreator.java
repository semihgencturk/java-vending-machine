package Controllers.denomination;

import Models.Denomination;
import static App_data.DenominationTable.denominationTable;

public class DenominationCreator {
    private static DenominationCreator self = new DenominationCreator();
    public static DenominationCreator getInstance() { return self; }

    public void denominationCreator() {
        denominationTable.add(Denomination.getInstance());
    }

    public void denominationCreator(int denominationId, String denominationCurrency, double denominationAmount){
        Denomination denomination = Denomination.getInstance();

        denomination.setDenominationId(denominationId);
        denomination.setDenominationCurrency(denominationCurrency);
        denomination.setDenominationAmount(denominationAmount);

        denominationTable.add(denomination);
    }
}
