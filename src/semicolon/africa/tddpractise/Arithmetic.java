package semicolon.africa.tddpractise;

public class Arithmetic {
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public double divideNumbers(int num1, int num2) {
        if(num1 > 0 && num2 > 0){
        return num1 / num2;
        }else{
            throw new ArithmeticException("not a valid divisor");
        }
    }
}
