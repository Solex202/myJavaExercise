import ChapterNine.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {
    MyStack stack;
    @BeforeEach
    public void setUp(){
        stack = new MyStack();
    }
    @Test
    void newStack_isEmpty() throws Exception{
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePushIsNotEmpty() throws Exception{
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

//    @Test (expected = MyStack.Underflow.class)
//    void willThrowUnderflow_WhenEmptyStackIsPopped() throws Exception{
//
//    }
}
