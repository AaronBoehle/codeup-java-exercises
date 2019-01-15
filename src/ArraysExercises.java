import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] bandMembers = {
                new Person("Andy"),
                new Person("Aaron"),
                new Person("Chris"),
                new Person("Adrian")
        };

//        for (Person names : bandMembers) {
//            System.out.println(names.getName());
//        }

        bandMembers = addPerson(bandMembers, "Slash");
        System.out.println("\nMeet the band: \n");
        for (Person names : bandMembers) {
            System.out.println(names.getName());
        }
    }
     public static Person[] addPerson (Person[] array, String name){
        Person newMember = new Person(name);
        Person[] newLineUp = Arrays.copyOf(array, (array.length+1));
        newLineUp[array.length] = newMember;
         return newLineUp;
     }

}