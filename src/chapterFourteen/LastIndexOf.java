package chapterFourteen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastIndexOf {
    private String string;

    public LastIndexOf(String string) {
        this.string = string;
    }

    public int _lastIndexOf(char character) {
        int _lastIndex = -1;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                _lastIndex = i;
            }
        }
        return _lastIndex;
    }

    public int _count(char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }

        }
        return count;

    }

    public int _lastIndexOf(char character, boolean bool){
        int _lastIndex = -1;
            if (bool) {
                string = string.toLowerCase();
                character = Character.toLowerCase(character);
                for (int i = 0; i < string.length(); i++) {
                    if (string.charAt(i) == character) {
                        _lastIndex = i;
                    }
                }
            }else _lastIndexOf(character);
        return _lastIndex;
    }


    public int _firstIndexOf(char character) {
        int _firstIndex = -1;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == character){
                _firstIndex = i;
                break;
            }
        }
        return _firstIndex;
    }

    public static void main(String[] args) {
        LastIndexOf last = new LastIndexOf("boy is good");
//        int index = last._lastIndexOf('u');
//        int index1 = last._lastIndexOf('U', true);
////        System.out.println(index1);
//        int index2 = last._firstIndexOf('u');
//        System.out.println(last._count('u'));
        String [] word = last._split("is");
        System.out.println(Arrays.toString(word));

    }

    public String [] _split(String delimiter){
        if(delimiter.equals("")){
            String [] splitString = new String[string.length()];
            for (int i = 0; i <string.length() ; i++) {
                splitString[i] = String.valueOf(string.charAt(i));
            }
            return splitString;
        }
        List<String> splitString = new ArrayList<>();
        int lastIndex = 0;
        int length = delimiter.length();

        for (int i = 0; i < string.length(); i++) {
            if(i+1 - length >= 0) {
                String subStringOne = string.substring(i-length+1, i + 1);

                if (subStringOne.equals(delimiter)) {
                    String subString = string.substring(lastIndex, i+1-length);
                    if (!subString.equals("")) {
                        splitString.add(subString);
                    }
                        lastIndex = i + 1;
                }
            }
        }
    splitString.add(string.substring(lastIndex));
        String [] splitStringArray = new String[splitString.size()];
        for (int i = 0; i <splitStringArray.length ; i++) {
            splitStringArray[i] =  splitString.get(i);
        }
        return splitStringArray;
    }

}
