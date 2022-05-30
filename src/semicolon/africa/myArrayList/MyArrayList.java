package semicolon.africa.myArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyArrayList {



    private boolean isEmpty = false;
    private int size;
    private int capacity;
    String [] list;


    public MyArrayList(int capacity) {
        this.capacity = capacity;
        list  = new String[capacity];
    }

    public boolean isEmpty() {
        if (getSize() == 0) return true;
        return false;
    }

    public int getSize() {
        return size;
    }

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
                size--;
            }
        }
    }

    public boolean contains(String element) {
        for (String s : list) {
            if (Objects.equals(s, element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String element) {
        for (int i = 0; i < list.length; i++) {
            if(element == list[i]) {
                return i;
            }
        }
         return -1;
    }
}
