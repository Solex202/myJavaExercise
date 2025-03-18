package leetcode.arrays;

public class ReverseInt {
    public int reverseInt(int num) {

        String convertedInt = String.valueOf(num);
        StringBuilder builder = new StringBuilder();

        if(convertedInt.startsWith("-")){
            convertedInt = convertedInt.replace("-", "");
        }
        for (int i = convertedInt.length() -1; i >= 0; i--) {
            builder.append(convertedInt.charAt(i));
        }
        int reversedInteger = Integer.parseInt(builder.toString());

        return num < 0 ? -reversedInteger : reversedInteger;
    }

    public int reverseInt2(int number){
        int remainder ;
        int reversed = 0;
        while(number != 0){
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }

        return reversed;
    }
}
