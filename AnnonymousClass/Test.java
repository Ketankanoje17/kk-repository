package AnnonymousClass;

public class Test {
    public static void main(String[] args) {
        Employee e=new Employee() {
            @Override
            public void details() {
                System.out.println("hello world");
            }

        };
        e.details();
    }



}
