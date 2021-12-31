package ChapterFourMain;

public class CreditLimitCalculator {

    private long accountNumber;
    private int balanceAtTheBeginningOfTheMonth;
    private int totalOfItemCharged;
    private int totalOfAllCreditApplied;
    private int allowedCreditLimit;

    public CreditLimitCalculator(long accountNumber, int balanceAtTheBeginningOfTheMonth, int totalOfItemCharged, int totalOfAllCreditApplied, int allowedCreditLimit){
        this.accountNumber = accountNumber;
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
        this.totalOfItemCharged = totalOfItemCharged;
        this.totalOfAllCreditApplied = totalOfAllCreditApplied;
        this.allowedCreditLimit = allowedCreditLimit;
    }

        public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
        }

        public long getAccountNumber(){
        return accountNumber;
        }

        public void setBalanceAtTheBeginningOfTheMonth(int balanceAtTheBeginningOfTheMonth){
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
        }

        public int getBalanceAtTheBeginningOfTheMonth(){
        return balanceAtTheBeginningOfTheMonth;
        }

        public void setTotalOfItemCharged(int totalOfItemCharged){
        this.totalOfItemCharged = totalOfItemCharged;
        }

        public int getTotalOfItemCharged(){
        return totalOfItemCharged;
        }

        public void setTotalOfAllCreditApplied(int totalOfAllCreditApplied){
        this.totalOfAllCreditApplied = totalOfAllCreditApplied;
        }

        public int getTotalOfAllCreditApplied(){
        return totalOfAllCreditApplied;
        }

        public void setAllowedCreditLimit(int allowedCreditLimit){
        this.allowedCreditLimit = allowedCreditLimit;
        }


        public int getAllowedCreditLimit(){
        return allowedCreditLimit;
        }

        public int getNewBalance() {
            int newBalance = (balanceAtTheBeginningOfTheMonth + totalOfItemCharged) - allowedCreditLimit;
            if (newBalance < allowedCreditLimit) {
                return newBalance;
            } else {
                System.out.println("credit  limit exceeded");
                return newBalance;
            }
        }
 }
