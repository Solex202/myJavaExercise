package BikeApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBikeTest {

    myBike bike;

    @BeforeEach
    public void setUp(){
        bike = new myBike("okada");
    }
    @Test
    public void bikeCanBeTurnedOn(){
      //given that we have a bike and we can turn it on
     // myBike bike = new myBike("okada");
      bike.getName();
      assertEquals("okada",bike.getName());
      bike.turnOn();
        assertTrue(bike.isOn());

    }


    @Test
    public void bikeCanBeTurnedOff(){
        //my bike should have a name
        //myBike bike = new myBike("okada");
        //turn on bike
        bike.turnOn();
        assertTrue(bike.isOn());
        //for bike to be on
        bike.turnOff();
        assertFalse(bike.isOn());
        assertEquals(false,bike.isOn());


    }

    @Test
    public void bikeCanBeAcceleratedBy1(){
    //myBike bike = new myBike("okada");
    bike.turnOn();
    assertTrue(bike.isOn());
    for(int i = 0;i < 19;i++) {
        bike.gearAccelerator();
    }
    int bikeGear = bike.getAcceleration();
    assertEquals(19,bikeGear);

    }

    @Test
    public void bikeCanBeAcceleratedBy2(){
      //myBike bike = new myBike("okada");
      bike.turnOn();
      assertTrue(bike.isOn());
      for(int i = 0;i < 19;i++){
      bike.gearAccelerator();
      }
      bike.gearAccelerator();
      //check that the bike is increase by 2
      assertEquals(22,bike.getAcceleration());


    }

    @Test
    public void bikeCanBeAcceleratedBy3(){
        //myBike bike = new myBike("okada");
        bike.turnOn();
        assertTrue(bike.isOn());
        for(int i = 0;i < 23;i++){
            bike.gearAccelerator();
        }
        bike.gearAccelerator();
        //check that the bike is increase by 3
        assertEquals(33,bike.getAcceleration());


    }
    @Test
    public void bikeCanBeAcceleratedBy4(){
       // myBike bike = new myBike("okada");
        bike.turnOn();
        assertTrue(bike.isOn());
        for(int i = 0;i < 26;i++){
            bike.gearAccelerator();
        }
        bike.gearAccelerator();
        //check that the bike is increase by 4
        assertEquals(46,bike.getAcceleration());


    }

}
