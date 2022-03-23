package chapterFourteen;

public class WordExtraction {

        public static void returnBalloon(String string){
            int countB = 0;
            int countA = 0;
            int countL = 0;
            int countO = 0;
            int countN = 0;

        for (int i = 0; i < string.length(); i++) {
            switch(String.valueOf(string.charAt(i)).toLowerCase()) {
                case "a" -> {
                    countA++;
                }
                case "b" ->{
                    countB++;
                }
                case "l" ->{
                    countL++;
                }
                case "o" ->{
                    countO++;
                }
                case "n" ->{
                    countN++;
                }
            }
        }
            System.out.println(new StringBuilder().append(countA).append(" ").append(countB).append(" ").append(countL).append(" ").append(countN).append(" ").append(countO).toString());
            System.out.println(Math.min(countB,Math.min(countA,Math.min(countL,Math.min(countO,countN)))));

    }
    public static void main(String[] args) {
//        String str = "Hey this is Ram";
//        String[] words = str.split(" ", 3);
//        for (String word : words)
//            System.out.println(word.toString());
        returnBalloon("HJSBALLLLOOOONNNAASJDNMMKMKAAANNOOLLBBJKSJIJLLOKMMOOOBBAALLUHNJUSHH");

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
