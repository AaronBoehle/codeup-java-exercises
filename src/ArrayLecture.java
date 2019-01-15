public class ArrayLecture {
    public static void main(String[] args) {

        //initializer syntax
        int[] numbers = {5,4,3,2,1};
        int sum = 0;
        for (int num:numbers){
            sum+=sum;
        }
        System.out.println("Array sum is: "+ sum + "\n");

        System.out.println("Meet the Beetles!\n");
        Person[] cohort = new Person[5];
        cohort[0] = new Person("Ringo");
        cohort[1] = new Person("Paul");
        cohort[2] = new Person("George");
        cohort[3] = new Person("John");
        cohort[4] = new Person("Maharshi Mahesh Yogi");
        //cohort[5] = new Person("James");

        for (Person person : cohort) {
            System.out.println(person.getName());
        }
        Car[] cars = new Car[2];
        cars[0] = new Car("VW", "Bug");
        cars[1] = new Car("VW", "S");
    }
}
