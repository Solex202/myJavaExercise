package chaptersixteen;

    import java.util.*;


public class ListExample {

    public static void main(String [] args){

        String [] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};


        List<String> list = Arrays.asList(colors);
        Collections.sort(list);
        System.out.println(list);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List<String> listView = Arrays.asList(suits);
        listView.sort(Collections.reverseOrder());
        System.out.println(listView);











//        List <String> list = new ArrayList<>();
//        list.add("Lota");
//        list.add("Dee");
//        list.add("Inc");
//
//        ListIterator<String> iterator = list.listIterator();
//        list.subList(2, 3);
//
//        for (String color : colors) {
//            list.add(color);
//
//        }
//
//        String [] removeColor = {"RED", "WHITE", "BLUE"};
//        List <String> removeList = new ArrayList<>();
//
//        for (String color : removeColor) {
//            removeList.add(color);
//
//        }

//        System.out.println(list);
    }

}
