package dataStructuresAndAlgorithms;

public class Dummy {

    int i = 0;

    Dummy increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Dummy x = new Dummy();
        x.increment().increment().increment().increment().increment().increment().print();

    }
}