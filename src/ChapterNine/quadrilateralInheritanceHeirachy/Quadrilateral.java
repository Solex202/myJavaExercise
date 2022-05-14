package ChapterNine.quadrilateralInheritanceHeirachy;

public class Quadrilateral {
    private double x_axis;
    private double y_axis;

    private Point point;

    public Quadrilateral(double x_axis, double y_axis) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
    }



    public double getX_axis() {
        return x_axis;
    }

    public void setX_axis(double x_axis) {
        this.x_axis = x_axis;
    }

    public double getY_axis() {
        return y_axis;
    }

    public void setY_axis(double y_axis) {
        this.y_axis = y_axis;
    }
}
