package semicolon.africa.tddpractise;

public class Digit {
    public String reverse(String digit) {

        String reversed =  "";

        for(int i = digit.length() - 1; i >= 0; i--){
            reversed += digit.charAt(i);
        }
        return reversed;
    }
}
