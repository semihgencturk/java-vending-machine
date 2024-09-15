package view.denominationManagementView;

import controller.definedDenominations.DefinedDenominationsLister;

public class DenominationManagementListerView {
    private static DenominationManagementListerView self = new DenominationManagementListerView();
    public static DenominationManagementListerView getInstance() { return self; }

    public void denominationManagementListerViewStarter() {
        System.out.println("List of Defined Vending Machines:");
        DefinedDenominationsLister.getInstance().definedDenominationsListerStarter();
    }
}
