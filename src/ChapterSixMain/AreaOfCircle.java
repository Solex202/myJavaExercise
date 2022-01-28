package ChapterSixMain;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        display("Enter radius ");
        double radius = scan.nextInt();
        System.out.printf( "The area of a circle is %.2fcm " ,circleArea(radius ) );
    }


    public static double circleArea(double radius){
        double area = 0;

        area =  Math.PI * (Math.pow(radius,2.0));

   return area;
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
    // year to be checked
   // int year = 1996;
  //  boolean leap = false;

// if the year is divided by 4
   // if (year % 4 == 0) {

            // if the year is century
          //  if (year % 100 == 0) {

            // if year is divided by 400
            // then it is a leap year
           // if (year % 400 == 0)
          //  leap = true;
         //   else
         //   leap = false;
         //   }

            // if the year is not century
        //    else
        //    leap = true;
         //   }

          //  else
          //  leap = false;

         //   if (leap)
         //   System.out.println(year + " is a leap year.");
         //   else
       //     System.out.println(year + " is not a leap year.");
       //     }
        //    }