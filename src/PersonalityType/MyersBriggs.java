package PersonalityType;

import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggs {
    private static final Scanner scanner = new Scanner(System.in);

    private String [] questions = {
            "(a).expand energy,conserve groups          (b).conserve energy,enjoy one-on-one",
            "(a).interpret literally            (b).look for meaning and possibilities",
            "(a).logical,thinking,questioning           (b).empathetic,feeling,accommodating",
            "(a).organized,orderly          (b).flexible,adaptable",
            "(a).more outgoing,think out loud           (b).more reserved,think to yourself",
            "(a).practical,realistic,experiential           (b).imaginative,innovative,theoretical",
            "(a).candid,straight forward,frank            (b).tactful,encouraging,kind",
            "(a).plan,schedule          (b).unplanned,spontaneous",
            "(a).seek many tasks,public activities,interaction with others          (b).seek private,solitary activities with quiet to concentrate",
            "(a).standard,usual,conventional            (b).different,novel,unique",
            "(a).firm,tend to criticize,hold the line           (b).gentle,tend to appreciate,conciliate",
            "(a).regulated,structured           (b).easygoing, \"live\" and \"let live\"",
            "(a).external,communicative,express yourself            (b).internal,reticent,keep to yourself",
            "(a).focus on here-and-now          (b).look to the future,global perspective,\"big picture\"",
            "(a).tough-minded,just          (b).tender-hearted,merciful",
            "(a).preparation,plan ahead             (b).go with the flow,adapt as you go",
            "(a).active,initiate            (b).reflective,deliberate",
            "(a).facts,things,\"what is\"           (b).ideas,dreams,\"what could be\",philosophical",
            "(a).matter of fact,issue-oriented          (b).sensitive,people oriented,compassionate",
            "(a).control,govern         (b).latitude,freedom"
    };
   private String[] resultant = new String [20];

    public void displayQuestion() {
        for (int i = 0; i < questions.length; i++) {
          String result = display(questions[i]);
            result = validateAnswer(i, result);
            storeAnswer(result);
        }
    }

    private String validateAnswer(int i, String result) {
        while(!result.equals("a") && !result.equals("b")){
            System.out.println("invalid input");
            result = display(questions[i]);
        }
        return result;
    }

    private void storeAnswer(String result) {
        for (int i = 0; i < resultant.length; i++) {
            if(resultant[i] == null) {
                resultant[i] = result;
                break;
            }
        }
        System.out.println(Arrays.toString(resultant));
    }

    private String display(String question) {
        System.out.println(question);
        String answer = scanner.nextLine();
        return answer;
    }

    public void promptForName(String msg) {
        System.out.println(msg);
        System.out.println("welcome " + input());
        System.out.println("what is your personality type?");
    }

    private String input() {
        return scanner.nextLine();
    }

    public void collateResult() {
        introvertAndExtrovert();
        sensitiveAndIntuitive();
        thinkersAndFeelers();
        judgementalAndPerceptives();
    }

    private void judgementalAndPerceptives() {
        int countA = 0;
        int countB = 0;
        for (int i = 3; i < resultant.length ; i+=4) {
            if(resultant[i] == "a"){
                countA++;
            }
           else if(resultant[i] == "b"){
               countB++;
            }
        }
        if(countA > countB){
            System.out.println("judgemental");
        }
        else{
            System.out.println("perceptive");
        }
    }

    private void thinkersAndFeelers() {
        int countA = 0;
        int countB = 0;
        for (int i = 2; i < resultant.length; i+=4) {
            if(resultant[i] == "a"){
                countA++;
            }
           else if(resultant[i] == "b"){
               countB++;
            }
        }
        if(countA > countB){
            System.out.println("thinkers");
        }
   else {
            System.out.println("feelers");
        }
    }

    private void sensitiveAndIntuitive() {
        int countA = 0;
        int countB = 0;
        for (int i = 1; i < resultant.length; i += 4){
            if(resultant[i] == "a"){
                countA++;
            }
        else if(resultant[i] == "b"){
            countB++;
            }
        }
        if(countA > countB){
            System.out.println("sensitive");
        }
        else{
            System.out.println("intuitive");
        }
    }

    private void introvertAndExtrovert() {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < resultant.length; i += 4) {
            if(resultant[i] == "a"){
                countA++;
            }
            else if(resultant[i] == "b"){
                countB++;
            }
        }
    if(countA > countB){
        System.out.println("extrovert");
    }
    else{
        System.out.println("introvert");
    }
    }
}
