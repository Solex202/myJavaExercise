package chapterFourteen;

public class SelfReview {

    public static void main(String[] args) {
        String s1  = new String("lota");
        String s2 = new String("lota");

        boolean check = s1.equals(s2);
        System.out.println(check);
        s1 += s2;
        System.out.println(s1);

        int len = s1.length();
        System.out.println(len);
    }
}
