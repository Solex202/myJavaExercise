package leetcode.arrays;

public class ReverseInt {
    public int reverseInt(int num) {

        String convertedInt = String.valueOf(num);
        StringBuilder builder = new StringBuilder();

        for (int i = convertedInt.length() -1; i >= 0; i--) {
            builder.append(convertedInt.charAt(i));
        }
        return Integer.parseInt(builder.toString());
    }
}
