package controller.definedDenominations;

import model.Denomination;
import static model.DefinedDenominations.definedDenominationsList;

public class DefinedDenominationsAdder {
    private static DefinedDenominationsAdder self = new DefinedDenominationsAdder();
    public static DefinedDenominationsAdder getInstance() { return self; }

    public void definedDenominationsAdderStarter(Denomination denomination) {
        definedDenominationsList.add(denomination);
    }
}
