package ChapterFourMain;

public class DanglingElse {
    public static void main(String[] args) {


//        int x = 9;
//        int y = 11;
//         x = 11;
//         y = 9;
//
//        if (x < 10) {
//            if (y > 10) {
//
//                System.out.println("*****");
//            }
//        }
//            else {
//            System.out.println("#####");
//            System.out.println("$$$$$");
//        }

        int x = 5;
        int y = 8;
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");


    }

}
