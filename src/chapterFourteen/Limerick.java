package chapterFourteen;

import java.security.SecureRandom;
import java.util.Arrays;

public class Limerick {

//    SecureRandom random = new SecureRandom();
public static void main(String[] args) {
    String str = "There was an Old Man with a beard," +
            " Who said 'It is just as I feared!" +
            " Two Owls and a Hen, " +
            "Four Larks and a Wren, " +
            "Have all built their nests in my beard";


    String [] words = str.split("[,!]");
    System.out.println(Arrays.toString(words));

    String first = words[0];
    String end = String.valueOf(words[0].charAt(first.length() - 1));
    String second = words[1];
    String third = words[2];
    String end2 = String.valueOf(words[2].charAt(third.length() - 1));
    String fourth = words[3];
    String fifth = words[words.length - 1];

    if ((first.endsWith(end) && second.endsWith(end) && fifth.endsWith(end)) && (third.endsWith(end2) && fourth.endsWith(end2))){
        System.out.println("IT IS A LIMERICK");

    }else System.out.println("NOT A LIMERICK");
}



}
