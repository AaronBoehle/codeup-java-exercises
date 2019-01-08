import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        System.out.print("Please enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You have entered the number " + userInput);

        System.out.print("Enter three different words to display: ");
        String userWord_1 = scanner.next();
        String userWord_2 = scanner.next();
        String userWord_3 = scanner.next();
        // System.out.println("Your selected words: \n" + userWord_1 + "\n" + userWord_2 + "\n" + userWord_3 + "\n");
        System.out.format("Your selected words: \n %s \n %s \n %s \n", userWord_1, userWord_2, userWord_3);

        System.out.println("Please type a sentence worth repeating: ");
        String userSentence = scanner.next() + scanner.nextLine();
        System.out.println("Repeat after me: \n"+ userSentence);

        System.out.print("Enter the length, width, and height (in feet) of a Codeup classroom: ");
        double userLength = (scanner.nextInt());
        double userWidth = (scanner.nextInt());
        double userHeight = (scanner.nextInt());
        double classPerimeter = (userLength*2)+(userWidth*2);
        double classArea = (userLength*userWidth);
        double classVolume = (userHeight*userLength*userWidth);
        System.out.format("The perimeter of the Codeup class is %.2f ft and the area is %.2f ft^2. The volume of the room is %.2f ft^3", classPerimeter, classArea, classVolume);




    }

}



/*
Bonuses

The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimeter method. Add the following line of code to your application after you have created a scanner (assuming the variable the holds the scanner is named scanner):


scanner.useDelimeter("\n");
How does this change the way your program operates?

Rewrite your classroom calculating program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
*/