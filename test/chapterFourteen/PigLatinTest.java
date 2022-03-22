package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    @Test
    void testPiglatinWord(){
        PigLatin pigLatin = new PigLatin();
        String result = pigLatin.printLatinWord("jump");
        assertEquals("umpjay",result);
    }

}