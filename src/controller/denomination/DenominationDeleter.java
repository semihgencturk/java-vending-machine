package controller.denomination;

import controller.definedDenominations.DefinedDenominationsRemover;

public class DenominationDeleter {
    private static DenominationDeleter self = new DenominationDeleter();
    public static DenominationDeleter getInstance() { return self; }

    public void denominationDeleterStarter(int denominationIndex) {
        DefinedDenominationsRemover.getInstance().definedDenominationsRemoverStarter(denominationIndex);
    }
}
