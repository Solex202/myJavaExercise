package TelevisionDriver;


import java.util.Scanner;

public class MyTelevision {

    private int channels = 1;
    private String tvName;
    private boolean isOn;
    private int volume ;

    public MyTelevision(String tvName) {
        this.tvName = tvName;
    }


    public String getName() {
        return tvName;

    }


    public void turnOn() {
        isOn = true;

    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }


    public int getVolume() {
        if (isOn) return volume;
        return 0;
    }


    public void increaseVolume() {
        if (isOn) {
            if (volume < 100) {
               // volume = 1;
                volume++;
            }

        }       //volume++;
    }

    public void decreaseVolume() {
   if(isOn){
      if(volume >= 1){
          volume--;
      }

   }
    }

    public int getChannels() {
        if (isOn) {

            return channels;
        }
       return 0;
    }

    public void setChannels(int channelNumber) {
    if(isOn){
        if (channelNumber <= 12){
            channels = channelNumber;
        }
    }
    }

    public void increaseChannel() {
        if(isOn){
            if(channels < 12){
                channels++;
            }
        }
    }

    public void decreaseChannel() {
   if(isOn){
       if(channels >= 12){
           channels--;
       }
   }
    }

    public static void main(String... args) {
        MyTelevision television = new MyTelevision("Lota's TV");
        System.out.println("welcome to lota's tv");
        System.out.println();
        System.out.println("""
                Press 1 to turn on
                 
                """);


        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();


        switch (input) {
            case 1 -> {
                television.turnOn();
                System.out.println("Our television is now on");
                System.out.println("""
                        Press 1 for volume
                        press 2 for channels
                        press 3 to turn off
                        """);

                int output = scanner.nextInt();
                do {
                    switch (output) {

                        case 1 -> {
                            System.out.println("""
                                    press 1 to increase volume
                                    press 2 to decrease volume
                                     """);
                            int userInput = scanner.nextInt();
                            switch (userInput) {
                                case 1 -> {
                                    // television.getVolume();
                                    television.increaseVolume();
                                    System.out.println("volume is increased to " + television.getVolume());
                                }
                                case 2 -> {
                                    //television.getVolume();
                                    television.decreaseVolume();
                                    System.out.println("volume is decreased to " + television.getVolume());
                                }
                            }
                        }
                    }

                }
                while (true);



            }

           case 2 ->{
               System.out.println("""
                       press 1 to increase channel
                       press 2 to decrease channel"""
               );
            int outputOutput = scanner.nextInt();
            do{
              switch (outputOutput){

                  case 1 -> {
                      television.increaseChannel();
                      System.out.println("channel is decreased" + television.getChannels());
                  }
                  case 2 -> {
                      television.decreaseChannel();
                      System.out.println("channel is decreased " + television.getChannels());
                  }
              }

            }while (true);

            }
            case 3 ->
                    television.turnOff();
        }

        }

            }








