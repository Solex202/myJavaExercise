package bankApp;

public class myAccount {
    public myAccount(String name, String pin) {
    this.name = name;
    this.pin = pin;


    }
        private int balance = 50_000;
        private String name;
        private String pin;


    public String getAccountName() {
        return name;
    }

    public int getBalance(String pin) {
   return balance;
    }

    public void depositCash(int amount) {
        if (amount > 0)
    balance += amount;
    }

    public void withdrawCash(int amount, String myPin) {
        if (amount <= balance && myPin == pin && amount > 0) {
            balance -= amount;
        }
    }
}
