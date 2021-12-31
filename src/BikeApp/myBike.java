package BikeApp;



public class myBike {

    //public int getAcceleration;
    private  String bkName;
    private boolean isOn;
    private int speedometer = 0;
    private int gear;

    public myBike(String bkName) {
    this.bkName = bkName;
    }

    public String getName() {
    return bkName;

      }

    public boolean isOn() {

        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void gearAccelerator() {
       if (isOn) {

           if (speedometer >= 0 && speedometer < 20) {
               gear = 1;
               speedometer++;
           }
           if (speedometer >= 20 && speedometer < 30) {
               gear = 2;
               speedometer += 2;
           }
           if (speedometer >= 30 && speedometer < 40) {
               gear = 3;
               speedometer += 3;
           }
           if (speedometer >= 40) {
               gear = 4;
               speedometer += 4;
           }


       }
    else
        speedometer = 0;

    }


    public int getAcceleration() {
        return speedometer;
    }
}

