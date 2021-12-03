package chapterSix;

public class Kata {
    public char calculateGradeFor(int score) {
        if (score > 89) return 'A';
        if (score > 79) return 'B';
        if (score > 70) return 'C';
        if (score > 60) return 'D';
        return 'F';

    }


    public int calculateQuantityAgainstPriceFor(int quantity, int price) {
        if (quantity <= 4) {
            return quantity * price;
        }
        if (quantity <= 7){
            return quantity * price;
        }
        if (quantity <= 15) {
            return quantity * price;
        }
           if (quantity <= 30) {
            return quantity * price;
           }
        if (quantity <= 55) {
            return quantity * price;
        }
           if (quantity <= 100) {
            return quantity * price;
           }

            if (quantity <= 203) {
            return quantity * price;
            }
            if (quantity <= 500) {
            return quantity * price;
            }
           return 0;
    }






}