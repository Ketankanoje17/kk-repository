package multipleinheritance;

public interface Scanner {
   default void start()
    {
        System.out.println("Scanner is started....");
    }

    void scanDocument(String document);

}
