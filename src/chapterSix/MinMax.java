package chapterSix;

public class MinMax {


    public static String findMinMax(int firstNumber, int secondNumber, int thirdNumber) {
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;


   if(firstNumber < minimum){
       minimum = firstNumber;
   }
    if(firstNumber > maximum){
        maximum = firstNumber;
    }
   if(secondNumber < minimum){
       minimum = secondNumber;
   }
    if(secondNumber > maximum){
        maximum = secondNumber;
    }
   if(thirdNumber < minimum){
       minimum = thirdNumber;
   }
    if(thirdNumber > maximum){
        maximum = thirdNumber;
    }

    String result = String.format("%d,%d",minimum,maximum);
    return result;

    }


    public static void main(String[] args) {
        String result = findMinMax(56,23,80);
        System.out.printf("%s",result);
    }

}
