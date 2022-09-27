package chapterSeventeen;

import java.util.*;
public class RandomizingList {


        public static void main(String[] args)
        {
            ArrayList<String> myList = new ArrayList<>();
            myList.add("ide");
            myList.add("quiz");
            myList.add("exam");
            myList.add("quiz");
            myList.add("practice");
            myList.add("qa");

            System.out.println("Original List : \n" + myList);

            Collections.shuffle(myList);

            System.out.println("\nShuffled List : \n" + myList);
        }
    }


