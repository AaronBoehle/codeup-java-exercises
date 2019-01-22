package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();

        Student aaron = new Student("Aaron");
        aaron.addGrade(73);
        aaron.addGrade(90);
        aaron.addGrade(87);
        students.put("a-a-ron", aaron);

        Student ben = new Student("Ben");
        ben.addGrade(78);
        ben.addGrade(94);
        ben.addGrade(81);
        students.put("b3n-jAmm1n", ben);

        Student linda = new Student("Linda");
        linda.addGrade(88);
        linda.addGrade(79);
        linda.addGrade(93);
        students.put("lyn-duh", linda);

        Student bruce = new Student("Bruce");
        bruce.addGrade(91);
        bruce.addGrade(82);
        bruce.addGrade(76);
        students.put("br000ce", bruce);

        //GIVES LIST OF KEYS FROM HASHMAP
        System.out.println("\nWelcome!\n");
        do {
            String userInput = input.getString(("Which student would you like to see more information on?\n \n"+ students.keySet()));
            if (students.containsKey(userInput)) {
                String userName = students.get(userInput).getName();
                Double userGPA = students.get(userInput).getGradeAverage();
                System.out.printf("\n Username: %s \n GPA: %.2f", userName, userGPA);
            } else {
                System.out.println("\nSorry, that username does not exist.");
            }
        } while (input.yesNo("\nWould you like to view another student's grades?"));
    }
}
