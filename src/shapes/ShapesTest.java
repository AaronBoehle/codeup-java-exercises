package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        //INTERFACE
        Measurable myShape = new Square(4);
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());

        Measurable shape = new Rectangle(10, 17);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());




    }
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("Area of a rectangle is: " + box1.getArea());
//        System.out.println("Perimeter of a rectangle is: " + box1.getPerimeter());
//        Square box2 = new Square(5);
//        System.out.println("Area of a square is: " + box2.getArea());
//        System.out.println("Perimeter of a square is: " + box2.getPerimeter());
//    }
}
