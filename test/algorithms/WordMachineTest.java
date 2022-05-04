package algorithms;

import dataStructuresAndAlgorithms.WordMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordMachineTest {
    WordMachine wordMachine;
    @BeforeEach
    void setUp(){
         wordMachine = new WordMachine();
    }
    @Test
    void testThatAnItemCanBeAdded() {

        String[] ops = { "1", "2", "3"};
        wordMachine.solutions(ops);
        assertEquals(3, wordMachine.getStack().size());
    }

//    @Test
//    countOfDuplicate
}