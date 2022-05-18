package ChapterNine.quadrilateralInheritanceHeirachy;

import java.util.Scanner;

public class Square extends Quadrilateral{

    private double side_A_Length;
    private double side_B_Length;
    public Square(double x_axis, double y_axis, double side_A_Length, double side_B_Length) {
        super(x_axis, y_axis);
        if(side_A_Length != side_B_Length){
            throw new NumberFormatException("value of side A and side B must be same");
        }else{

        this.side_A_Length = side_A_Length;
        }

        if(side_B_Length != side_A_Length){
            throw new NumberFormatException("value of side B and side A must be same ");
        }
        this.side_B_Length = side_B_Length;
    }


    public double getSide_A_Length() {
        return side_A_Length;
    }

    public void setSide_A_Length(double side_A_Length) {
        this.side_A_Length = side_A_Length;
    }

    public double getSide_B_Length() {
        return side_B_Length;
    }

    public void setSide_B_Length(double side_B_Length) {
        this.side_B_Length = side_B_Length;
    }

    public double calculateArea(){
        return getSide_A_Length() * getSide_B_Length();
    }

//    public static void main(String[] args) {
//
//        Square square = new Square();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter side a");
//        double sideA = scanner.nextDouble();
//
//    }

}
