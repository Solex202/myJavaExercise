package chapterFourteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TokenizingTelephoneNumber {

    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();

        StringBuilder builder= new StringBuilder();
        String telephone = "(555) 555-5555";
      String[] code =   telephone.split("-");
      String str = code[0].substring(1, 4);
      array.add(str);
      String strt = code[0].substring(6, 9);
      array.add(strt);
      array.add(code[1]);

      for (int i = 0; i < array.size(); i++) {
          builder.append(array.get(i));
          if (i == 0) builder.append("-");
      }
        System.out.println(builder);
    }

}
