package ChapterSixMain;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        display("Enter fahrenheit");
        int fahrenheit = scan.nextInt();
        display("celsius is " + celsius(fahrenheit) + "\n");

        display("Enter celsius");
        int celsius = scan.nextInt();
        display("fahrenheit is " + fahrenheit(celsius));
    }

    public static  int celsius(int fahrenheit){
        int celsius = 0;
        //32 - 212 Fahrenheit range
        //if(fahrenheit <= 32 || fahrenheit >= 212){
         //   System.out.println("invalid fahrenheit range");
       // }
         celsius = (int) (5.0 / 9.0 * (fahrenheit - 32));

    return celsius;
    }
        public static int fahrenheit(int celsius){
        int fahrenheit = 0;
        // 0 - 100 celsius range
        //if(celsius >= 0 && celsius <= 100) {
           // System.out.println("invalid celsius range");
        //}
            fahrenheit = (int) (9.0 / 5.0 * (celsius + 32));
        return fahrenheit;
        }

    public static void display(String message){
        System.out.println(message);
    }
}
