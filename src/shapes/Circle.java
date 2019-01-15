package shapes;

import java.lang.reflect.Method;
import util.Input;

public class Circle {
    Input input = new Input();
    private double radius;
    private static int numberOfCircles = 0;

    //CONSTRUCTORS
    public Circle(double radius){
        this.radius = radius;
        numberOfCircles++;
    }
    public static int getNumberOfCircles(){
        return numberOfCircles;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}
