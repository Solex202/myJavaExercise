package ChapterSevenMain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicationEliminationTest {

    @Test
    void testThatDuplicateElementsCannotBeStoredInTheArray(){
        //given
        DuplicationElimination duplicateElimination = new DuplicationElimination();
        int[] storedArray = new int [5];
//        storedArray.add(1);
        int result = duplicateElimination.removeDuplicate(storedArray);

    }

}