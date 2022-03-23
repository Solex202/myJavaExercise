package chapterFourteen;

public class GettingIndex {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String name = "miSsisSippi";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 's') {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}