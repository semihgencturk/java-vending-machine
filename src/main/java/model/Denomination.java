package model;

public class Denomination {
    private int denominationId;
    private String denominationCurrency;
    private double denominationAmount;

    public Denomination() {}

    public int getDenominationId() {
        return denominationId;
    }
    public void setDenominationId(int denominationId) {
        this.denominationId = denominationId;
    }

    public double getDenominationAmount() {
        return denominationAmount;
    }
    public void setDenominationAmount(double denominationAmount) {
        this.denominationAmount = denominationAmount;
    }

    public String getDenominationCurrency() {
        return denominationCurrency;
    }
    public void setDenominationCurrency(String denominationCurrency) {
        this.denominationCurrency = denominationCurrency;
    }
}
