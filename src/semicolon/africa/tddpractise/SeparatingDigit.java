package semicolon.africa.tddpractise;

public class SeparatingDigit {

    private String num;
//    public String value ;

    public void setDigit(String number) {
        num = number;
    }

    public String getDigit() {
        StringBuilder s = new StringBuilder();
//        int numLen = num.length();
        int number = Integer.parseInt(num);
        if(num.length() == 5){
            s.append(number / 10000).append(" ");
            s.append(number % 10000 / 1000).append(" ");
            s.append(number % 1000 / 100).append(" ");
            s.append(number % 100 / 10).append(" ");
            s.append(number % 10);
        }
        return s.toString();
    }

    public static void main(String[] args) {
     SeparatingDigit digit = new SeparatingDigit();

     digit.setDigit("34567");
        System.out.println(digit.getDigit());
    }
}
