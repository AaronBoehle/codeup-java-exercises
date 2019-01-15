package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.yesNo("Yes or no?"));
        System.out.println(input.getInt("Please enter a number:"));
        System.out.println(input.getInt("Enter a number between %d and %d \n",1,50));
        System.out.println(input.getString("Tell me something!"));
        System.out.println(input.getDouble("Please enter any number:"));
        System.out.println(input.getDouble("Enter a number between %d and %d \n", 1, 50));
    }
}
