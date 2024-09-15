package controller.denomination;

import static model.DefinedDenominationList.definedDenominationList;

public class DenominationDetailer {
    private static DenominationDetailer self = new DenominationDetailer();
    public static DenominationDetailer getInstance() { return self; }

    public void denominationDetailerStarter(int denominationIndex) {
        System.out.println(definedDenominationList.get(denominationIndex));
    }
}
