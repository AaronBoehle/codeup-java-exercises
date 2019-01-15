public class Car {
    public static void main(String[] args) {
        Car batmobile = new Car("Wayne Enterprises", "Bat2c");
        Car beetle = new Car("VW", "BUG");

        System.out.println(Car.getNumberOfCars());
        System.out.println("Current speed is: " + beetle.speed);
        beetle.accelerate();
        beetle.accelerate();
        beetle.accelerate();
        System.out.println("Gas tank: " + beetle.gasTank);
        System.out.println("Speed: " + beetle.speed);
        System.out.println("Distance: " + beetle.miles);
        beetle.slamOnBrakes();
    }
    public String make;
    public String model;
    public short year;
    public String color;
    public String license;

    public int speed;
    public int gasTank;
    public int miles;

    private static int numberOfCars = 0;

    //constructor
    public Car(String make, String model){
        this.make = make;
        this.model = model;
        numberOfCars++;
        gasTank = 100;
    }

    public static int getNumberOfCars(){
        return numberOfCars;
    }
    public void accelerate() {
        if (model.equals("Batmobile")) {
            speed += 100;
            gasTank --;
            miles += 5;
            slamOnBrakes();
        } else {
            gasTank--;
            speed++;
            miles++;
            System.out.println("This car is now going: " + speed);
        }
    }
    public void brake(){
        speed--;
    }
    public void slamOnBrakes (){
        speed = 0;
        System.out.println("SCREEEEEEEEETCH");
    }
    public void honk(){
        System.out.println("HONK HONK");
    }

}
