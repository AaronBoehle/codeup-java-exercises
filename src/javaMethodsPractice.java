import java.util.concurrent.ThreadLocalRandom;

//public class javaMethodsPractice {
//    public static boolean coinFlip () {
//        int headsOrTails = (int) Math.ceil(Math.random()*((2-1)+1));
//        if (headsOrTails == 1) {
//            return true;
//        }
//        return false;
//    }
//    public static int randomWalk (int n) {
//        int randomOnesAndZeros = (int) Math.ceil(Math.random()*((2-1)+1));
//        for ();
//
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        System.out.println(coinFlip());
//    }
//}


//    Java Methods Practice Part 2
//
//        Write a method named randomWalk that takes in an integer and returns a string of that many random ones and zeros.
//        Example: randomWalk(1) returns a string with one character that is randomly 0 or 1. randomWalk(33) returns a string with 33 random 1s or 0s.
//
//        Write a method named countOnes that takes in a string of ones and zeroes and returns a count of the ones.
//        Write a method named countZeros that takes in a string of ones and zeroes and returns a count of the 0s.
//
//        Write a method named analyzeRandomWalk that accepts a string containing ones and zeroes and prints out the number of ones and the number of zeroes. This method is void because it does not return anything. Example: analyzeRandomWalk("11000") should print "There are 2 ones and 3 zeroes".
//
//        Write a method named longestRun that accepts a string of ones and zeroes and returns an integer that specifies the longest consecutive sequence of either 0s or 1s. Example: longestRun("1001111100") returns 5 because there are 5 ones in a row. longestRun("01001") returns 2 because there are two consecitive zeroes.
//
//        Write a method named secondLongestRun that accepts a string of 1s and 0s and returns an integer that specifies the length of the second longest run of consecutive numbers. Example secondLongestRun("111001") returns 2 because the two 0s in a row are the second longest run.
//
//        Write a method named magic8ball that prompts the user to input a question. If the user inputs a string that does not have a question mark at the end, then start the method over again. When answering the magic 8 ball randomly returns one of a set of string options like the following:
//        "All signs point to yes", "The future is cloudy. Ask again", "Very doubtful", "Outlook not so good.", "Don't count on it.", "You may rely on it!", "Ask again later."
//
//        Write a method named dndDiceRoll that accepts a string of the format "2d6" where the first number(s) are the number of dice and the second number is the number of sides of each of those dice. Example: "5d4" rolls a four sided die 5 times and returns the sum of the result.
//
//        Write a method named l5rDiceRoll that accepts a string of the following format "6k4" where the first number is the number of dice to roll, the second number is the number of dice we keep the highest values from, and each die has 10 sides. Example "4k2" rolls 4 dice of 10 sides, and returns the sum of keeping the highest 2 rolls.
//
//
//
//
//        Collapse 
//        Message Input
//
//
//        Message yosemite