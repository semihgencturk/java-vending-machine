package controller.definedDenominations;

import static model.DefinedDenominationList.definedDenominationList;

public class DefinedDenominationsRemover {
    private static DefinedDenominationsRemover self = new DefinedDenominationsRemover();
    public static DefinedDenominationsRemover getInstance() { return self; }

    public void definedDenominationsRemoverStarter(int denominationIndex) {
        definedDenominationList.remove(denominationIndex);
    }
}
