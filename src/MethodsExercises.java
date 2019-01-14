import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodsExercises {
    public static int addition (int addend1, int addend2) {
        return addend1+addend2;
    }
    public static int subtraction (int minuend, int subtrahend) {
        return minuend-subtrahend;
    }
    public static double multiplication (double multiplier, double multiplicand) {
        if (multiplier==0 || multiplicand==0) {
            return 0;
        }
//        return multiplier*multiplicand;
        if (multiplicand>0) {
            multiplicand--;
            return multiplier+multiplication(multiplier,multiplicand);
        } else {
            return -multiplication(multiplier,multiplicand);
        }
    }
    public static int division (int numerator, int denominator) {
        if (numerator==0 || denominator==0) {
            return 0;
        }
        return numerator/denominator;
    }
    public static int modulus (int mod1, int mod2) {
        return mod1%mod2;
    }
    public static int inputScanner (){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        return scanner.nextInt();
    }
    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 16");
        int userInput = inputScanner();
        if (userInput<1 || userInput>16) {
            System.out.println("Sorry, the number you selected is not between 1 and 16. Please try again.");
            userInput = getInteger(min, max);
        }
        return userInput;
    }
//    public static String doesUserContinue (Scanner scanner) {
//        System.out.println("Now that we have an integer, would you like to calculate it's factorial?");
//        String userInput = scanner.useDelimiter("\n".toLowerCase()).next();
//
//
//    }
    public static long factorial(int n) {
        if (n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int diceSides (int a) {
        System.out.println("Enter the number of sides for a pair of dice");
        int userInput = inputScanner();
        if (userInput<6) {
            System.out.println("Dice need at least six sides, silly!");
            return diceSides(a);
        }
        return userInput;
    }
    public static void rollDice (int die1, int die2) {
        System.out.println("Ready to roll the dice? If so respond 'y' or 'yes");

    }



    public static void main(String[] args) {
        System.out.println(addition(4,5));
        System.out.println(subtraction(8,2));
        System.out.println(multiplication(3,4));
        System.out.println(division(12,3));
        System.out.println(modulus(15,2));
        System.out.println(factorial(getInteger(1,16)));
    }
}

//    Create an application that simulates dice rolling.
//
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.