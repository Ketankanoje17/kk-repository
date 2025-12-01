package methodReference;

public class ComparePerson {

    public static int compareByName(Person a,Person b)
    {
        return  a.getName().compareTo(b.getName());
    }

}
