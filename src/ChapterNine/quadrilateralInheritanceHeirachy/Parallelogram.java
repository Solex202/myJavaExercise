package ChapterNine.quadrilateralInheritanceHeirachy;

public class Parallelogram extends Quadrilateral{


    private double base;
    private double height;
    public Parallelogram(double x_axis, double y_axis, double height, double base) {
        super(x_axis, y_axis);
        this.height = height;
        this.base = base;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateArea(){
      return  getBase() * getHeight();
    }

}
