public class LyyraCard {

    private double balance;

    //constructor
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }

    //payEconomical method
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    //payGourmet method
    public void payGourmet() {
        if(this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    //loadMoney method
    public void loadMoney(double amount) {
        if (amount >= 0) {
            if (amount <= 150 - this.balance) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }
        }
    }

    //toString method
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
