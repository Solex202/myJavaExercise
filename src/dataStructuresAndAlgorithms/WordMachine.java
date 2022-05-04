package dataStructuresAndAlgorithms;

import java.util.Collection;
import java.util.Stack;

public class WordMachine {
    Stack<Integer> stack = new Stack<Integer>();

    public void solutions(String[] ops) {
        for (int i = 0; i < ops.length; i++) {
            stack.push(Integer.parseInt(ops[i]));
        }
    }

    public Stack<Integer> getStack() {
        return stack;
    }
}
