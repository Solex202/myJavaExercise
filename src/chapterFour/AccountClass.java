package chapterFour;

import bankApp.myAccount;

import java.util.Scanner;



public class AccountClass {
       public static myAccount mainAccount;
       private static Scanner scan = new Scanner(System.in);



       public static void main(String[] args) {
              initialPrompt();

       }

       private static void initialPrompt() {
              String prompt = """
                       1.create Account
                       2.Exit  
                         
                      """;
           System.out.println(prompt);

              int userInput = input(prompt);

              if (userInput == 1) {
                     createAccount();
                     accountOption();

              }
              System.exit(0);

       }

       public static void createAccount() {

      Scanner scan = new Scanner(System.in);
              System.out.println("Enter account name");
              String accountName = scan.nextLine();
             // mainAccount = new myAccount(accountName,accountPin);

              System.out.println("Enter your pin");
              String accountPin = scan.nextLine();
              mainAccount = new myAccount(accountName,accountPin);
              System.out.println("Your account has been created");


       }

       private static void accountOption() {
              do {
                     String secondPrompt = """
                             1.Deposit
                             2.Withdraw
                             3.Check balance
                             4.go back
                             5.Exit
                                                   
                             """;

                  System.out.println(secondPrompt);

                     int userOption = input(secondPrompt);
                     if (userOption == 1) {
                            int amount = input("enter amount to deposit");
                            mainAccount.depositCash(amount);
                         System.out.println("your deposit has been credited");
                     } else if (userOption == 2) {
                            int amountToWithdraw = input("How much do you want  to withdraw");
                            scan.nextLine();
                            display("What is your pin");
                            String userPin = scan.nextLine();
                            mainAccount.withdrawCash(amountToWithdraw, userPin);
                     } else if (userOption == 3) {
                            display("Enter your pin");
                            scan.nextLine();
                            String pinEntry = scan.nextLine();
                            int myAccountBalance = mainAccount.getBalance(pinEntry);
                            System.out.println(myAccountBalance);
                     } else if (userOption == 4) {

                            initialPrompt();
                     } else {
                            System.exit(0);
                     }
              }
                 while (true);

              }

       private static void display(String message) {
              System.out.println(message);
         }

       private static int input(String Prompt) {


           String prompt = "";
           display (prompt);
      return scan.nextInt();

       }


}
















