package util;

import java.security.cert.Extension;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");


//METHODS

    public String getString(String prompt){
        System.out.println(prompt);
         String input = "";
         input += scanner.nextLine();
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
        try {
            String userInput = scanner.nextLine();
            int userInteger = Integer.valueOf(userInput);
            return userInteger;
        } catch (Exception e) {
            System.out.println(e);
            return getInt(prompt);
        }
    }
    public int getInt (String prompt, int min, int max) {
        System.out.printf(prompt, min, max);
        try {
            String userString = scanner.nextLine();
            int userInteger = Integer.valueOf(userString);
            if (userInteger >= min && userInteger <= max) {
                return userInteger;
            } else {
                System.out.println("Sorry, that is not a valid number!");
                return getInt(prompt, min, max);
            }
        } catch (Exception e) {
            System.out.println("INVALID ENTRY: " + e);
            return getInt(prompt, min, max);
        }
    }
    public double getDouble (String prompt) {
        System.out.println(prompt);
        try {
            String userString = scanner.nextLine();
            double userDouble = Double.valueOf(userString);
            return userDouble;
        } catch (Exception e) {
            System.out.println("INVALID ENTRY: " + e);
            return getDouble(prompt);
        }
    }
    public double getDouble (String prompt, int min, int max){
            System.out.printf(prompt);
            try {
                String userInput = scanner.nextLine();
                double userDouble = Double.valueOf(userInput);
                if (userDouble >= min && userDouble <= max) {
                    return userDouble;
                } else {
                    System.out.println("Sorry, that is not a valid number!");
                    return getDouble(prompt, min, max);
                }
            } catch (Exception e) {
                System.out.println(e);
                return getDouble(prompt);
            }
}}
