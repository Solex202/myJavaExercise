package ChapterFive;
/*4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
        these items are as follows:
        Item Value
        1 239.99
        2 129.75
        3 99.95
        4 350.89*/


import java.util.Scanner;

public class SalesCommissionPro {
    public static void main(String[] args) {
        System.out.println("Enter number of items sold between o and less than 5 ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        int weeklyWage = 200;
        double price = 0;
        double totalValue = 0.0;

   while (userInput > 0 && userInput < 5){

       switch (userInput){
           case 1:
               price = 239.99;
           break;
           case 2:
               price = 129.75;
               break;
           case 3:
             price = 99.95;
             break;
           case 4:
               price = 350.89;
       }
       totalValue += price;

       System.out.println("Enter number of items sold between o and less than 5 ");
           userInput = scan.nextInt();
   }
       double totalSalary = weeklyWage + (totalValue * 0.09);
        System.out.println(totalSalary);

    }
}
