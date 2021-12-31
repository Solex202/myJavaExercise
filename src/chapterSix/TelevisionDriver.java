package chapterSix;

import TelevisionDriver.MyTelevision;

import java.util.Scanner;

public class TelevisionDriver {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MyTelevision television = new MyTelevision("HiSeens");

        String prompt = """
                press 1 to turn tv on
                press 2 to turn tv off
                """;
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        do {
            if (userInput == 1) {
                television.turnOn();
                int scan = prompt();


                if (scan == 1) {
                    television.getVolume();

                    String inputPrompt = """
                            press 1 to increase volume
                            press 2 to decrease volume
                            press 3 to go back
                            """;
                    System.out.println(inputPrompt);
                    int output = scanner.nextInt();
                    if (output == 1) {
                        television.increaseVolume();
                        System.out.println("volume  increased --> "   + television.getVolume());
                    }
                    if (output == 2) {
                        television.decreaseVolume();
                        System.out.println("volume decreased <-- "   + television.getVolume());
                    }
                    if (output == 3){
                        prompt();
                    }
                }
                if (scan == 2) {
                    television.getChannels();

                    String outputOutput = """
                            press 1 to increase channel
                            press 2 to decrease channel
                            """;
                    System.out.println(outputOutput);
                    int input = scanner.nextInt();
                    if (input == 1) {
                        television.increaseChannel();
                        System.out.println("channel  increased --> "   +  television.getChannels());
                    }
                    if (input == 2) {
                        television.decreaseChannel();
                        System.out.println("channel is decreased <-- "   +  television.getChannels());
                    }
                }

            }
            if (userInput == 2) {
                System.exit(0);
            }
        }while (true);
    }

    private static int prompt() {
        String userPromppt = """
                        press 1 for volume
                        press 2 for channels
                        """;
        System.out.println(userPromppt);
        int scan = scanner.nextInt();
        return scan;
    }


}
