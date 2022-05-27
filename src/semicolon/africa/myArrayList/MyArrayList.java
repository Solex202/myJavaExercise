package semicolon.africa.myArrayList;

import java.util.List;

public class MyArrayList {



    private boolean isEmpty = false;
    private final String [] list  = new String[5];
    private int size;

//    public boolean isEmpty() {
//        return !isEmpty;
//    }

    public void add(String element) {
        for (int i = 0; i < list.length; i++) {
            if(list[i] == null){
            list[i] = element;
            size++;
            break;}

        }
    }

    public int size() {
        return size;
    }

    public String[] getList() {
        return list;
    }
}
