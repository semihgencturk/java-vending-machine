package View.denominationView;

import Controller.denomination.DenominationReaderAll;

public class DenominationReaderAllView {
    private static DenominationReaderAllView self = new DenominationReaderAllView();
    public static DenominationReaderAllView getInstance() { return self; }

    public void denominationReaderAllView() {
        System.out.println("List of Defined Vending Machines:");
        System.out.println(DenominationReaderAll.getInstance().denominationReaderAll());
    }
}
