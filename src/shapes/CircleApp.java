package shapes;

import util.Input;

import java.lang.reflect.Method;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter the radius of a circle\n"));
        System.out.println("The area of your circle is: " + circle.getArea() + " units ^2");
        System.out.println("The circumference of the circle is: " + circle.getCircumference() + " units");
        input.yesNo("Would you like to configure another circle?");


    }
}
