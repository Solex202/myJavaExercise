package classwork.semicolon;

public class Palindrome {
    public static void main(String[] args) {


        String str = "conoc";
        String reverseStr = "";

        for(int i = str.length() - 1; i >= 0; i--) {

            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);

        if(str.equals(reverseStr)){
            System.out.println("this is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
