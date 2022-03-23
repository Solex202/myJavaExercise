package chapterFourteen;

public class WordExtraction {

    //    public static String returnBalloon(String string){
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == 'b,a,l,l,o,o,n') {}
//        }
//    }
    public static void main(String args[]) {
        String str = "Hey this is Ram";
        String[] words = str.split(" ", 3);
        for (String word : words)
            System.out.println(word.toString());

    }

//        public int substringCounting(String stng)
//        {
//            int l = stng.length();
//            int ctr = 0;
//            String firstTwo = "li";
//            String lastOne = "e";
//            if (l < 4)
//                return 0;
//            for (int i = 0; i < l - 3; i++)
//            {
//                if (firstTwo.compareTo(stng.substring(i,i+2)) == 0 && lastOne.compareTo(stng.substring(i+3, i+4)) == 0)
//                    ctr++;
//            }
//            return ctr;
//        }
//        public static void main (String[] args)
//        {
//            WordExtraction m = new WordExtraction();
//            String str1 =  "balloongrefevfwffballoonweswwbdadfkjkoololnmdballfdeddballoon";
//            System.out.println("The given string is: "+str1);
//            System.out.println("The substring life or li?e appear number of times: "+m.substringCounting(str1));
//        }
    }
