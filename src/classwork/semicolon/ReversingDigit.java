package classwork.semicolon;

import java.util.Scanner;

public class ReversingDigit {

    public String reverse(String words) {

    String storage = "";

        for (int i = words.length() - 1; i >= 0; i--) {

            storage += words.charAt(i);
        }

        return storage;
    }

}
