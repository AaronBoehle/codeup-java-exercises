package movies;

public class Movie {
    private String name;
    private String category;

    //CONSTRUCTOR
    public Movie(String name, String category) {
        setMovieName(name);
        setMovieCategory(category);
    }
    public void setMovieName(String name) {
         this.name = name;
    }
    public String getMovieName() {
        return this.name;
    }
    public void setMovieCategory(String category) {
        this.category = category;
    }
    public String getMovieCategory() {
        return this.category;
    }
    public String toString(){
        return getMovieName() + " --- " + getMovieCategory();
    }


//    static Movie[] movieCategory (String category) {
//        category = this.category;
//    }
}
