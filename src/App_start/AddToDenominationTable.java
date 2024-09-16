package App_start;

import Controllers.denomination.DenominationCreator;

public class AddToDenominationTable {
    private static AddToDenominationTable self = new AddToDenominationTable();
    public static AddToDenominationTable getInstance() { return self; }

    public void addToDenominationTable() {
        DenominationCreator.getInstance().denominationCreator(1, "TRY", 5);
        DenominationCreator.getInstance().denominationCreator(2, "TRY", 10);
        DenominationCreator.getInstance().denominationCreator(3, "TRY", 20);
        DenominationCreator.getInstance().denominationCreator(4, "EUR", 1);
        DenominationCreator.getInstance().denominationCreator(5, "EUR", 5);
    }
}
