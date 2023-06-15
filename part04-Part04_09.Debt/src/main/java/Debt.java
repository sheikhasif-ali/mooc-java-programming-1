public class Debt {
    private double balance;
    private double rate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.rate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.rate;
    }
}
