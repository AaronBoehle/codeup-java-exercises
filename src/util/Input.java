package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");


//METHODS

    public String getString(String prompt){
        System.out.println(prompt);
         String input = "";
         input += scanner.next();
         return input.toLowerCase();
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String response = scanner.next().toLowerCase();
        if (response.equalsIgnoreCase("yes") ||
                response.equalsIgnoreCase("y") ||
                response.equalsIgnoreCase("yeah")||
                response.equalsIgnoreCase("sure")) {
            return true;
        } else {
            return false;
        }
    }
    public int getInt (String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }
    public int getInt (String prompt, int min, int max) {
        System.out.printf(prompt, min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Sorry, that is not a valid number!");
            return getInt(prompt, min, max);
        }
    }
    public double getDouble (String prompt) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }
    public double getDouble (String prompt, int min, int max){
            System.out.printf(prompt);
            int userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.println("Sorry, that is not a valid number!");
                return getDouble(prompt, min, max);
            }
        }
}
