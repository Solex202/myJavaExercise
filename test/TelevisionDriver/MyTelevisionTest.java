package TelevisionDriver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyTelevisionTest {

    MyTelevision television;

    @BeforeEach
    public void setUp(){
        television = new MyTelevision("infinix tv");

    }

    @Test
    public void tvCanBeTurnedOnTest() {
        //given that we have a television and we can turn it on
        television.getName();
        assertEquals("infinix tv", television.getName());
        //when tv is on
        television.turnOn();
        //check if television turn on
        assertTrue(television.isOn());
        //CHECK IF TELEVISION IS TURN OFF


    }

    @Test
    public void tvCanBeTurnedOffTest() {
        //my tv must be on
        //when tv is on
        television.turnOn();
        assertTrue(television.isOn());
        //for tv to be off
        television.turnOff();
        //check if television is off
        assertFalse(television.isOn());

    }

    @Test
    public void volumeCanBeIncreasedBy1() {
        television.turnOn();
        assertTrue(television.isOn());
        //to increase volume
        television.getVolume();
        for(int i = 0;i <=100 ;i++){
         television.increaseVolume();
         }//
        //television.increaseVolume();
        int volume = television.getVolume();
        //check that volume can be increased by 1
        assertEquals(100, volume);


    }

    @Test
    public void getTelevisionChannel(){
        television.turnOn();
    assertTrue(television.isOn());
    //get channels
        television.setChannels(10);
    assertEquals(10,television.getChannels());
    }


    @Test
    public void volumeCanBeDecreasedBy1() {

    television.turnOn();
    assertTrue(television.isOn());
    television.getVolume();
    television.increaseVolume();
    int volume = television.getVolume();
    assertEquals(1,television.getVolume());
    //to decrease volume
       // for(int i = 100;i >=1; i--){
            television.decreaseVolume();
    //}

    assertEquals(0,television.getVolume());

    }
    @Test
    public void channelCanBeIncreasedBy1(){
        television.turnOn();
       assertTrue(television.isOn());
       television.getChannels();
       television.increaseChannel();
        assertEquals(2,television.getChannels());
    }

    @Test
    public void channelCanBeDecreasedBy1(){
        //given

        television.turnOn();
        assertTrue(television.isOn());
        //when
        television.getChannels();
        television.decreaseChannel();
        //assert
        assertEquals(1,television.getChannels());
    }


}




