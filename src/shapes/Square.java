package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;

    }

    @Override
    public double getPerimeter() {
        return 4 *length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}








//public class Square extends Rectangle {
//    public Square(int side) {
//        super(side, side);
//    }
//    @Override
//    public int getArea(){
//        return (int) Math.pow(length, 2);
//    }
//    public int getPerimeter(){
//        return 4*length;
//    }
//}
