package Controller.denomination;

import Model.Denomination;
import static App_data.DenominationTable.denominationTable;

public class DenominationReader {
    private static DenominationReader self = new DenominationReader();
    public static DenominationReader getInstance() { return self; }

    public Denomination denominationReader(int denominationIndex) {
        return denominationTable.get(denominationIndex);
    }
}
