package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] arr = {"flourish", "flow", "floight"};
        String res = commonPrefix(arr);
        System.out.println(res);
    }
    public static String commonPrefix(String [] arr){
        var builder = new StringBuilder();

        if(arr == null || arr.length == 0) return builder.toString();

        int lengthOfSmallestElement = arr[0].length();

        for (String s : arr) {
            lengthOfSmallestElement = Math.min(lengthOfSmallestElement, s.length());
        }

        for (int i = 0; i < lengthOfSmallestElement; i++){
            char current = arr[0].charAt(i);

            for (String word: arr) {
                if(word.charAt(i) != current){
                    return builder.toString();
                }
            }
            builder.append(current);
        }
        
        return builder.toString();
    }
}
