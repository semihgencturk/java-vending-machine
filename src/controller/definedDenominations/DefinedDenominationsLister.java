package controller.definedDenominations;

import static model.DefinedDenominations.definedDenominationsList;

public class DefinedDenominationsLister {
    private static DefinedDenominationsLister self = new DefinedDenominationsLister();
    public static DefinedDenominationsLister getInstance() { return self; }

    public void definedDenominationsListerStarter() {
        System.out.println(definedDenominationsList);
    }
}
