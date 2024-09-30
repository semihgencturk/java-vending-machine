package model.vendingMachine;

import model.Denomination;

public class DenominationAvailability {
    private Denomination denomination;
    private int denominationCountOnUsage;

    public Denomination getDenomination() {
        return denomination;
    }
    public void setDenomination(Denomination denomination) {
        this.denomination = denomination;
    }

    public int getDenominationCountOnUsage() {
        return denominationCountOnUsage;
    }
    public void setDenominationCountOnUsage(int denominationCountOnUsage) {
        this.denominationCountOnUsage = denominationCountOnUsage;
    }
}
