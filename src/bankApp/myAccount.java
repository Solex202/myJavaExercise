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

    public int getBalance(String i) {
   return balance;
    }

    public void depositCash(int amount) {
    balance += amount;
    }
}
