public class Denomination {

    private String denominationCurrency;
    private int denominationAmount;

    public int getDenominationAmount() {
        return denominationAmount;
    }

    public void setDenominationAmount(int denominationAmount) {
        this.denominationAmount = denominationAmount;
    }

    public String getDenominationCurrency() {
        return denominationCurrency;
    }

    public void setDenominationCurrency(String denominationCurrency) {
        /*
        if (validDenominationCurrencies.contains(denominationCurrency)) {
            this.denominationCurrency = denominationCurrency;
        } else {
            throw new IllegalArgumentException("Currency is invalid!");
        }
        */
        this.denominationCurrency = denominationCurrency;
    }
}
