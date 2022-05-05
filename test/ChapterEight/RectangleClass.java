package ChapterEight;

public class RectangleClass {

    private double width = 1;
    private double length = 1;

    public RectangleClass(double width, double length) {
        if(length <  0.0 || length > 20.0){
            throw new IllegalStateException("invalid length value");
        }else{

        this.length = length;
        }
        if(width < 0.0 || width > 20.0){
            throw new IllegalStateException("invalid width value");
        }else{

        this.width = width;
        }
    }

    public RectangleClass(){


    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <  0.0 || length > 20.0){
           throw new IllegalStateException("invalid length value");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0.0 || width > 20.0){
            throw new IllegalStateException("invalid width value");
        }
        this.width = width;
    }

    public double calculateArea() {
        return getWidth() * getLength();
    }

    public double calculatePerimeter() {
        return 2 * (getWidth() + getLength());
    }
}
