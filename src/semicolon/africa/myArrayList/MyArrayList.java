package semicolon.africa.myArrayList;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {



    private boolean isEmpty = false;
    private int size;
    private int capacity;
    String [] list;


    public MyArrayList(int capacity) {
        this.capacity = capacity;
        list  = new String[capacity];
    }

    //    public boolean isEmpty() {
//        return !isEmpty;
//    }

    public void add(String element) {
        for (int i = 0; i < list.length; i++) {
            checkArrayCapacity();
            if(list[i] == null){
                list[i] = element;
                size++;
                break;
            }
        }
    }

    private void checkArrayCapacity() {
        if (capacity <= size) {
            String[] newArray = list;
            capacity *= 2;
            list = new String[capacity];
            System.out.println(list.length);
            for (int i = 0; i < newArray.length; i++) {
                list[i] = newArray[i];
            }
        }
    }

    public int size() {
        return size;
    }

    public String[] getList() {
        return list;
    }

    public void remove(int index) {
        if(index >= capacity){
            throw new IndexOutOfBoundsException("index out of bound");
        }
        if(index < 0){
            throw new IndexOutOfBoundsException("index out of bound");
        }
        for (int i = 0; i < list.length; i++) {
            if (index == i){
                list[i] = list[i + 1];
                for (int j = i; j < list.length-1; j++) {
                    list[j] = list[j + 1];
                }
                System.out.println(Arrays.toString(list));
                size--;
            }



        }
    }
}
