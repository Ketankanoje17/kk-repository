package comparablecompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> ab = new ArrayList<>();
        ab.add(new Movie("sholay", 9.0, 2021));
        ab.add(new Movie("3 idiots", 7.0, 2017));
        ab.add(new Movie("bad boys", 9.1, 2001));

        Collections.sort(ab);

        for(Movie sort:ab)
        {
            System.out.println("release movie is "+sort.getMovieName()+ " and year is "+sort.getYear());

        }

//rating sorting
    }
}
