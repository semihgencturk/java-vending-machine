package Controller.denomination;

import Model.Denomination;
import java.util.ArrayList;
import static App_data.DenominationTable.denominationTable;

public class DenominationReaderAll {
    private static DenominationReaderAll self = new DenominationReaderAll();
    public static DenominationReaderAll getInstance() { return self; }

    public ArrayList<Denomination> denominationReaderAll() {
        return denominationTable;
    }
}
