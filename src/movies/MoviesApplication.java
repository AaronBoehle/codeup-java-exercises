package movies;

import util.Input;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    static Input input = new Input();

    public static void main(String[] args) {

        Movie[] moviesArray = MoviesArray.findAll();
        Scanner scanner = new Scanner(System.in);
        boolean userExit = true;
        do {
            int movieMenu = input.getInt(
                    "Welcome to your movie application! Select from the options below: \n"
                            + 0 + " - Exit\n"
                            + 1 + " - View all movies\n"
                            + 2 + " - Animated\n"
                            + 3 + " - Drama\n"
                            + 4 + " - Horror\n"
                            + 5 + " - Sci-Fi\n"
                            + 6 + " - Musical\n"
                            + 7 + " - Add Movie\n",
                    0, 7);

            switch (movieMenu) {
                case 0:
                    System.out.println("Thanks for visiting!");
                    System.exit(0);
                    userExit = false;
                    break;
                case 1:
                    displayAll(moviesArray);
                    break;
                case 2:
                    displayFilter(moviesArray, "animated");

                    break;
                case 3:
                    displayFilter(moviesArray, "drama");

                    break;
                case 4:

                    displayFilter(moviesArray, "horror");
                    break;
                case 5:
                    displayFilter(moviesArray, "scifi");
                    break;
                case 6:
                    displayFilter(moviesArray, "musical");
                    break;
                case 7:
                    addMovie(moviesArray);
                default:
                    break;
            }
        } while (userExit);


    }


    static void displayAll (Movie [] moviesArray) {
        for (Movie selection : moviesArray) {
            System.out.println(selection.toString());
        }
    }
    static void displayFilter (Movie [] filterArray, String category) {
        for (Movie filtered : filterArray) {
            if (filtered.getMovieCategory().equals(category)) {
                System.out.println(filtered.toString());
            }
        }
    }
    public static Movie[] addMovie (Movie[] array){
        String name, category;
        name = input.getString("Please enter a movie title: ");
        category = input.getString("Please enter a category for this movie:");
        Movie newMovie = new Movie(name, category);
        Movie[] newMovieArray = Arrays.copyOf(array, (array.length+1));
        newMovieArray[array.length] = newMovie;
        return newMovieArray;
    }
}
