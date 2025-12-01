package comparablecompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {

        //compare
        ArrayList<MovieNew> ab = new ArrayList<>();
        ab.add(new MovieNew("sholay", 9.0, 2021));
        ab.add(new MovieNew("3 idiots", 7.0, 2017));
        ab.add(new MovieNew("bad boys", 9.1, 2001));
// rating compare
        Collections.sort(ab,new Rating());

        for(MovieNew mv:ab)
        {
            System.out.println("sorting by movie "+mv.getMovieName()+ " by rating "+mv.getRating());
        }


    }
}
