package controller.definedDenominations;

import model.Denomination;
import static model.DefinedDenominations.definedDenominationsList;

public class DefinedDenominationsRemover {
    private static DefinedDenominationsRemover self = new DefinedDenominationsRemover();
    public static DefinedDenominationsRemover getInstance() { return self; }

    public void definedDenominationsRemoverStarter(Denomination denomination) {
        definedDenominationsList.remove(denomination);
    }
}
