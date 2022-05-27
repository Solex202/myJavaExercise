package semicolon.africa.myArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    MyArrayList myArrayList;

    @BeforeEach
    void setUp() {
        myArrayList = new MyArrayList();
    }

    @Test
    void testThatArrayListIsEmpty(){
        assertFalse(myArrayList.isEmpty());

    }

    @Test
    void testThatCanAddElementsInArrayList(){
        myArrayList.add("weed");
        myArrayList.add("shoe");
        myArrayList.add("cloth");

    }

    @AfterEach
    void tearDown() {
    }
}