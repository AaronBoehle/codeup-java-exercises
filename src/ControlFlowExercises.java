import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 5;
        int count = 0;
        int countDownFrom_100 = 100;
        long squaredNum = 2;

        while (i <= 15) {
            System.out.format("%d ", i);
            i++;
        }
        do {
            System.out.println(count);
            count += 2;
        } while(count<=100);
        do {
            System.out.println(countDownFrom_100);
            countDownFrom_100 = countDownFrom_100 - 5;
        } while(countDownFrom_100<= -10);
        do {
            System.out.println(squaredNum);
            squaredNum = squaredNum*squaredNum;
        }while(squaredNum<1000000);

        String fizzBuzz = "";
        for (int j = 1; j<=100;j++){
            if (j%3 == 0){
                fizzBuzz += "fizz";
            }
            if (j%5 == 0){
                fizzBuzz += "Buzz";
            }
            if (j%3 != 0 && j%5 !=0){
                fizzBuzz += j;
            }
            System.out.println(fizzBuzz);
            fizzBuzz = "";
        }

        int userInput;
        String userChoice;
        do {
            System.out.println("What number would you like to go up to?");
            userInput = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int z = 1; z <= userInput; z++) {
                System.out.printf("%-6d | %-7d | %-5d%n", z, (int) Math.pow(z, 2), (int) Math.pow(z, 3));
            }
            System.out.println("Do you want to do another number?");
            userChoice = scanner.next();

        } while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));

        System.out.println("What is your grade?");
        int grade = scanner.nextInt();
        String letterGrade;
        if(grade>=88){
            letterGrade = "A";
        } else if(grade>=80) {
            letterGrade = "B";
        } else if(grade>=67) {
            letterGrade = "C";
        } else if(grade>=60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.println("Your letter grade is a " + letterGrade);
    }
}

/*
For

refactor the previous two exercises to use a for loop instead

Convert given number grades into letter grades.

Prompt the user for a numerical grade from 0 to 100.
Display the corresponding letter grade.
Prompt the user to continue.
Assume that the user will enter valid integers for the grades.
The application should only continue if the user agrees to.
Grade Ranges:

A : 100 - 88
B : 87 - 80
C : 79 - 67
D : 66 - 60
F : 59 - 0
Bonus

Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
*/