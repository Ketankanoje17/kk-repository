package multipleinheritance;

public class Operations implements Printable,Scanner,Document{

    @Override
    public void start() {
        Printable.super.start();
        Scanner.super.start();

        System.out.println("Operation is started printing document");
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("document is scanning :"+document);

    }

    @Override
    public void print(String document) {
        System.out.println("print is printing :"+document);

    }

    @Override
    public void document() {
        System.out.println("successfully scan document");
    }
}
