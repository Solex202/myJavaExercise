package chapterFourteen;

import java.util.Scanner;

public class ReversingString {

    public static void strRev(char[] str, int start, int end) {
        if (str == null || str.length < 2) {
            return;
        }

        while (start < end) {

            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        char[] str = {'w','i','l','l'};
        ReversingString.strRev(str,1,3);
    }
}

