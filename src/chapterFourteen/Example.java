package chapterFourteen;

import java.util.stream.IntStream;
public class Example {


//    public class StringReversal {
        public static void main(String[] args) {
            String input = "hello";
            String reversed = new StringBuilder(input).reverse().toString();
            String concatenated = reversed + "esnbuxo5671";

            StringBuilder sb = new StringBuilder();
            IntStream.range(0, concatenated.length()).forEach(i -> {
                char c = concatenated.charAt(i);
                if ((i + 1) % 4 == 0) {
                    sb.append("_");
                } else {
                    sb.append(c);
                }
            });

            String finalString = sb.toString();
            System.out.println(finalString);
        }
//    }

}
