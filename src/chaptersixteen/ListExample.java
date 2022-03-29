package chaptersixteen;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.Collection;


public class ListExample {

    public static void main(String [] args){

        String [] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List <String> list = new ArrayList<>();

        for (String color : colors) {
            list.add(color);

        }

        String [] removeColor = {"RED", "WHITE", "BLUE"};
        List <String> removeList = new ArrayList<>();

        for (String color : removeColor) {
            removeList.add(color);

        }

//        System.out.println(list);
    }

}
