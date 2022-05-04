package chapterFourteen;

public class RemovingSpace {

    public static void main(String[] args) {
        String newString = "    chair  man  ".trim();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < newString.length(); i++) {
            if(newString.charAt(i) != ' '){
                string.append(newString.charAt(i));
            }
        }
        System.out.println(string);

    }
}
