package multipleinheritance;

public interface Printable {
  default void start()
    {
        System.out.println("printer is started");
    }
    void print(String document);
}
