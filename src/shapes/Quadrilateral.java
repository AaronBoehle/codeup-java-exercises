package shapes;

abstract public class Quadrilateral extends Shape implements Measurable {

    protected double length, width;

    //CONSTRUCTOR
    public Quadrilateral(double length, double width) {
//        setLength(length);
//        setWidth(width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
       return (2*length)+(2*width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    //GETTERS
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //SETTERS
    public abstract void setLength(double length);

    public abstract void setWidth(double width);

}