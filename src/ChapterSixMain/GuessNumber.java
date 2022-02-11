package ChapterSixMain;

import java.util.*;

public class GuessNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int randomGenerator = getRandomGenerator();
        System.out.println(randomGenerator);
    int guessCount = 0;
        checkLoop(randomGenerator, guessCount);
    }

    private static int getRandomGenerator() {
        Random random = new Random();

        return random.nextInt(1000) + 1;
    }

    private static void checkLoop(int randomGenerator, int guessCount) {
        while(true) {
            display("Guess a number between 1 and 1000:");
            int userInput = scanner.nextInt();
            guessCount++;

            if (checkGuess(randomGenerator, guessCount, userInput)) break;
        }
    }

    private static boolean checkGuess(int randomGenerator, int guessCount, int userInput) {
        if(randomGenerator == userInput) {
            display("yo! congrats,you win!!!");
            display("You had " + guessCount + " guesses");
            display("!!!!!!!!!!!!!!");
            display("Do you wish to continue?\nyes\nno");
            String userChoice = scanner.nextLine();
            switch(userChoice){
                case "yes":
                    if(userChoice.equals("yes")){
                        getRandomGenerator();
                    }
            }
//
//            if(userChoice.equals("yes")){
//                getRandomGenerator();
//                int user = scanner.nextInt();
//            }
//            else if(userChoice.equals("no")){
//                System.exit(0);
//            }
            return true;}
        else if(userInput > randomGenerator){
            display("too high,try again");
        }
        else {
            display("too low,try again");
        }
        return false;
    }


    public static void display(String message) {
        System.out.println(message);
    }
}
//


    @Test

    void testContactListCanBeGotten(){
        //given that we have a phonebook and contacts
        PhoneBook phoneBook = new PhoneBook();
        Contact lota = new Contact("lota","09056819817");
        Contact dee = new Contact("dee","09056819817");
        //when we have contacts in it
        phoneBook.addContact(lota);
        phoneBook.addContact(dee);
        //assert
        assertEquals(2, phoneBook.getAllContact().size());
        List<Contact> expected = new ArrayList<>(Arrays.asList(lota, dee));  //{lota, dee}.toArray() [lota,dee]
        assertArrayEquals(expected.toArray(), phoneBook.getAllContact().toArray());
    }