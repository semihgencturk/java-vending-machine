package Controllers.denomination;

import static App_data.DenominationTable.denominationTable;

public class DenominationDeleter {
    private static DenominationDeleter self = new DenominationDeleter();
    public static DenominationDeleter getInstance() { return self; }

    public void denominationDeleter(int denominationIndex) {
        denominationTable.remove(denominationIndex);
    }
}
