package comparablecompartor;

import java.util.Comparator;

public class Rating implements Comparator<MovieNew> {
    @Override
    public int compare(MovieNew o1, MovieNew o2) {
        return Double.compare(o1.getRating(),o2.getRating());
    }
}
