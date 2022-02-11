package ChapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

import static ChapterSeven.ArrayExample.display;

public class ChristmasQuestions {
    public static void main(String[] args) {


        //ArrayList<String> christmas = new ArrayList<>();
        String q1 = "When is christmas celebrated?\n" +" (A). 25th December \n (B). 30th february";
        String q2 = "Where was Jesus born?\n" +" (A).Bethlehem\n (B). Oshodi";
        String q3 = "Who is the mother of Jesus?\n" + " (A). Adeola Onwuka \n (B). Mary";
        String q4 = "What does the green colour symbolizes?\n" + " (A).continuity of life \n (B). Nigerian flag";
        String q5 = "Where did the 3 wise men come from?\n" + " (A). Maidugri \n (B). East";
        String q6 = "How did mary conceive Jesus?\n" + " (A).blow Job \n (B).Holy Spirit ";
        String q7 =  "Which country started the tradition of decorating the Christmas trees?\n" + "(A). Germany \n (B). zimbabwe";
        String q8 =  "What is the duration between Christmas and Epiphany?\n" + " (A). 200 days \n (B). 12 days";
        String q9 = "What is placed at the top of the Christmas tree?\n" + "(A).Olosho \n (B). Angel";
        String q10 = "Which country sends a huge Christmas tree to London, every year?\n" + "(A). Nigeria \n (B). Norway";
        String q11 =  "Who wrote 'A Christmas Carol'?\n" + "(A). Mr Chibuzo \n (B). Charles Dickens";
        String q12 = "What do the Swedish watch on Christmas Eve?\n" + "(A). porn \n (B). Donald Duck";
        String q13 = "In which ocean is Christmas island situated?\n" + "(A).Third mainland bridge \n (B). Indian Ocean";
        String q14 = "Where was the largest Christmas fruit cake made?\n" + "(A). Germany \n (B). Kutuweji";
        String q15 = "What was the weight of the largest fruit cake?\n" + "(A). 23 pounds \n (B). 9596 pounds";
        String q16 = "The largest mince weighed over a tonne?\n" + "(A). True* \n (B). False";
        String q17 = "Name the chef who made the tallest candy cane?\n" + "(A). Chef esther junior dev \n (B). Chef Alain roby";
        String q18 = "Where was the tallest candy cane made?\n" + "(A). Geneva \n (B). Sabo";
        String q19 = "What did the three wise men gift baby Jesus?\n" + "(A). Myrhh, gold and frankincense \n(B). bread and beans , eba and groundnut";
        String q20 = "Which popular Christmas song was played in space?\n" + "(A). akanchawa \n(B). jingle bells";


                Question [] questions = {
           new Question(q1,"A"),
           new Question(q2,"A"),
           new Question(q3,"B"),
           new Question(q4,"A"),
           new Question(q5,"B"),
           new Question(q6,"B"),
           new Question(q7,"A"),
           new Question(q8,"B"),
           new Question(q9,"B"),
           new Question(q10,"B"),
           new Question(q11,"B"),
           new Question(q12,"B"),
           new Question(q13,"B"),
           new Question(q14,"A"),
           new Question(q15,"B"),
           new Question(q16,"A"),
           new Question(q17,"B"),
           new Question(q18,"A"),
           new Question(q19,"A"),
           new Question(q20,"B")

         };
        takeQuestions(questions);

    }
        public static void takeQuestions(Question [] questions){
        Scanner input = new Scanner(System.in);
        int score = 0;
        for (int i = 0;  i < questions.length- 15 ; i++) {
            int random = (int) (Math.random() *19) + 1;
            System.out.println(questions[random].prompt);
            String answer = input.nextLine().toUpperCase();
            if(answer.equals(questions[random].answer)){
                score++;
            }
        }
            System.out.println("you got " + score + "/" + (questions.length- 15));
    }
}