package ChapterFourMain;

import java.util.Scanner;

public class CreditLimitDriver {

    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(4398880018L,45_000,12,6,80_000);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account Number:");
        long account = scan.nextInt();

        System.out.println("Enter balance at beginning of the month:");
        int balance = scan.nextInt();

        System.out.println("Enter the total of item charged:");
        int totalOfItem = scan.nextInt();

        System.out.println("Enter total of credit applied:");
        int creditTotal = scan.nextInt();
        System.out.println("Enter allowed credit limit:");
        int creditLimit = scan.nextInt();



        creditLimitCalculator.setAccountNumber(account);
        System.out.printf("your account number is %d%n", creditLimitCalculator.getAccountNumber());

        creditLimitCalculator.setBalanceAtTheBeginningOfTheMonth(balance);
        System.out.printf("Your balance is %d%n", creditLimitCalculator.getBalanceAtTheBeginningOfTheMonth());

        creditLimitCalculator.setTotalOfItemCharged(totalOfItem);
        System.out.printf("The total of item charged is %d%n", creditLimitCalculator.getTotalOfItemCharged());

        creditLimitCalculator.setTotalOfAllCreditApplied(creditTotal);
        System.out.printf("Total credit applied is %d%n", creditLimitCalculator.getTotalOfAllCreditApplied());

        creditLimitCalculator.setAllowedCreditLimit(creditLimit);
        System.out.printf("Maximum credit limit is %d%n", creditLimitCalculator.getAllowedCreditLimit());

        System.out.printf("Therefore,new account balance is %d%n", creditLimitCalculator.getNewBalance());


    }

}
