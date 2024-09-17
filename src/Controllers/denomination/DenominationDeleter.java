package Controllers.denomination;

import static App_data.DenominationTable.denominationTable;

public class DenominationDeleter {
    private static DenominationDeleter self = null;
    public static DenominationDeleter getInstance() {
        if (self == null) {
            self = new DenominationDeleter();
        }
        return self;
    }

    public void denominationDeleter(int denominationIndex) {
        denominationTable.remove(denominationIndex);
    }
}
