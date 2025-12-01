package comparablecompartor.practice;

import java.util.Comparator;

public class NameSort implements Comparator<Student> {

    @Override
    public int compare(Student obj1,Student obj2)
    {
        return  obj1.getId() - (obj2.getId());
    }
}
