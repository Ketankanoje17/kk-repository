package comparablecompartor;

public class MovieNew {
    private String movieName;
    private double rating;
    private int year;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MovieNew(String movieName, double rating, int year) {
        this.movieName = movieName;
        this.rating = rating;
        this.year = year;
    }
}
