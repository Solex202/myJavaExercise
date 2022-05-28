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
        myArrayList = new MyArrayList(5);
    }

//    @Test
//    void testThatArrayListIsEmpty(){
//        assertTrue(myArrayList.isEmpty());
//
//    }

    @Test
    void testThatCanAddElementsInArrayList(){
        myArrayList.add("weed");
        myArrayList.add("shoe");
        myArrayList.add("cloth");
//        assertEquals(3, myArrayList.size());
        assertArrayEquals(new String [] {"weed","shoe", "cloth", null , null}, myArrayList.getList());
    }

    @Test
    void testThatCapacityDoubleWhenItemIsAdded(){
        myArrayList.add("weed");
        myArrayList.add("shoe");
        myArrayList.add("cloth");
        myArrayList.add("laptop");
        myArrayList.add("cow");
        myArrayList.add("skirt");

        assertArrayEquals(new String [] {"weed","shoe", "cloth", "laptop" , "cow", "skirt", null, null, null, null}, myArrayList.getList());
    }

    @Test
    void testThatCanDeleteElementFromArray(){
        myArrayList.add("weed");
        myArrayList.add("shoe");
        myArrayList.add("cloth");
        myArrayList.add("laptop");
        myArrayList.add("cow");
        myArrayList.add("skirt");

        assertArrayEquals(new String [] {"weed","shoe", "cloth", "laptop" , "cow", "skirt", null, null, null, null}, myArrayList.getList());

        myArrayList.remove(3);

        assertArrayEquals(new String [] {"weed","shoe", "cloth", "cow", "skirt", null, null, null, null, null}, myArrayList.getList());

    }

    @Test
    void testThatDeleteElementOutOfBound_throwsException(){
        myArrayList.add("weed");
        myArrayList.add("shoe");
        myArrayList.add("cloth");
        myArrayList.add("laptop");
        myArrayList.add("cow");
        myArrayList.add("skirt");

        assertArrayEquals(new String [] {"weed","shoe", "cloth", "laptop" , "cow", "skirt", null, null, null, null}, myArrayList.getList());

        assertThrows(IndexOutOfBoundsException.class, ()-> myArrayList.remove(13));

    }

    @Test
    void testThatDeleteElementLessThanBound_throwsException(){
        myArrayList.add("weed");
        myArrayList.add("shoe");
        myArrayList.add("cloth");
        myArrayList.add("laptop");
        myArrayList.add("cow");
        myArrayList.add("skirt");

        assertArrayEquals(new String [] {"weed","shoe", "cloth", "laptop" , "cow", "skirt", null, null, null, null}, myArrayList.getList());

        assertThrows(IndexOutOfBoundsException.class, ()-> myArrayList.remove(-1));

    }




    @AfterEach
    void tearDown() {
    }
}