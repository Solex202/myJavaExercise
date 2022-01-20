package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void timeCanBeTested(){
        Time time = new Time();
    time.setTime(9,34,23);
        System.out.println(time);
    }

}