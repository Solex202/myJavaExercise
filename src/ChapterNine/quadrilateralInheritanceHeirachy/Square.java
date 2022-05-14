package ChapterNine.quadrilateralInheritanceHeirachy;

public class Square extends Quadrilateral{

    private double baseA;
    private double baseB;

    private double height;

    public Square(double x_axis, double y_axis, double baseA, double baseB, double height ) {
        super(x_axis, y_axis);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double calculateArea(){
        return (getBaseA() + getBaseB() / 2) * getHeight();
    }


}
