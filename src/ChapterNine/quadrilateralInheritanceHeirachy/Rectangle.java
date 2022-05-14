package ChapterNine.quadrilateralInheritanceHeirachy;

public class Rectangle extends Quadrilateral{

    private double length;
    private double width;
    public Rectangle(double x_axis, double y_axis, double width, double length) {
        super(x_axis, y_axis);
        this.width = width;
        this.length = length;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
