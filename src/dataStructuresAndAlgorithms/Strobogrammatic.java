package dataStructuresAndAlgorithms;


public class Strobogrammatic {

//    public boolean is_strobogrammatic(String number) {
//
//        if(!isNumeric(number)){
//            return false;
//        }
//
//        int left = 0;
//        int right = number.length()-1;
//
//        String [] non_strobogrammatic = {"2", "3","4","5", "7"};
//        String [] auto_strobogrammatic = {"1","8", "0"};
//
//        while (left <= right) {
////            if(number[left] || )
//        }
//
//        return false;
//    }
//
//    private static boolean isNumeric(String inputString) {
//        //check for null and empty string
//        if (inputString == null || inputString.length() == 0) {
//            return false;
//        }
//        return inputString.chars().allMatch(Character::isDigit);
//    }
public static int FirstFactorial(int num) {
    int factorial = 1;
    for(int i = 1; i < num; ++i){
        factorial *= i;
    }
    // code goes here
    return factorial;
}

    public static void main (String[] args) {

        int result = Strobogrammatic.FirstFactorial(10);
        System.out.print(result);
        // keep this function call here
        // Scanner s = new Scanner(System.in);
        // System.out.print(FirstFactorial(s.nextLine()));
    }
}
