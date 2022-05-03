package dataStructuresAndAlgorithms;

public class Array {

    private int [] items;
    private int count;

    public Array(int  length) {
        items = new int[length];
    }

    public void insert(int item){
        //if the array is full , resize it
        if(items.length == count){
            int [] newItems = new int [count * 2];

            //copy all the existing items
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            //set "items" to this new array
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        //validate the index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        //shift the items to the left to fill the hole
        for(int i = index; i < count  ; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    public int  indexOf(int item){
        for (int i = 0; i < items.length; i++){
            if(item == items[i]){
                return i;
            }
        }
             return -1;
    }

     public void print(){
        for(int i = 0; i < count  ; i++){
            System.out.println(items[i]);
        }
    }
}
