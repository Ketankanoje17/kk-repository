package multipleinheritance;

public class Main {
    public static void main(String[] args) {
        Operations o=new Operations();
        o.start();
        o.print("abc.pdf");
        o.scanDocument("scan.pdf");
        o.document();

    }
}
