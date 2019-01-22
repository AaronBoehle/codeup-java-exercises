package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // CONSTRUCTOR
    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // GETTER
    public String getName () {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade (int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        if (grades.size()==0){return 0;}
        for (Integer singleGrade : grades) {
            System.out.println(singleGrade);
            sum += singleGrade;
        }
        double gradeAverage = ((sum)/(grades.size()));
        return gradeAverage;
    }

    public static void main(String[] args) {

    }




}
