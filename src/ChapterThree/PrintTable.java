package ChapterThree;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
//        System.out.println("a \t\t b\t\tpow(a,b)");
//        System.out.printf("1 %s %d %s %d%n","\t\t", 2 ,"\t\t",1*1);

        //    Scanner scan = new Scanner(System.in);
        //        System.out.println("enter v");
        //        double v = scan.nextDouble();
        //
        //        System.out.println("enter a");
        //        double a = scan.nextDouble();
        //
        //        double length = (v * v) / (2 * a);
        //        System.out.printf("the minimum runway length for this airplane is %.3f " , length);


//        String name1 = "Alan Turing";
//        String name2 = "Alan Turingasa";
//
//        int diff = name1.compareTo(name2);
//        if(diff == 0){
//            System.out.println("the names are the same");
//        }else if (diff < 0){
//            System.out.println("name1 comes before name2");
//        }else if (diff > 0){
//            System.out.println("name2 comes before name1");
//        }

//        if(name1.equals(name2)){
//            System.out.println("the names are the same");
//        }
//        else {
//            System.out.println("not same");
//        }

        //System.out.println(Arrays.toString(args));
//       String str = "named";
//       int num = Integer.parseInt(str);
//        System.out.println(num);

      Rectangle box1 = new Rectangle(0, 0, 100,200);
      Rectangle box2 = box1;


        System.out.println(box2.width);

        box1.translate(50,50);
        System.out.println(box2.x);

        }
    }

