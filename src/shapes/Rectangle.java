package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    //IMPLEMENT
    public double getPerimeter(double length, double width) {
        return (2*length)+(2*width);
    }
    public double getArea(double length, double width) {
        return length*width;
    }

    //ABSTRACT
    public void setLength (double length){
        this.length = length;
    }
    public void setWidth (double width){
        this.width = width;
    }
}






//public class Rectangle {
//    protected int width, length;
//
//
//    //CONSTRUCTOR
//
//    public Rectangle(int length, int width){
//        this.width = width;
//        this.length = length;
//    }
//    protected int getArea(){
//        return length*width;
//    }
//    protected int getPerimeter(){
//        return (2*length)+(2*width);
//    }
//
//
//
//}