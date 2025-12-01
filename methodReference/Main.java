package methodReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> asList=new ArrayList<>();
        asList.add(new Person("ketan",11));
        asList.add(new Person("manoje",14));
        asList.add(new Person("sandesh",13));

        Collections.sort(asList,ComparePerson::compareByName);

        System.out.println("Sort by Name :");


    }
}
