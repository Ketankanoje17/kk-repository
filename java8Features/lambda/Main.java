package java8Features.lambda;

public class Main {
    public static void main(String[] args) {
//        StudentInter i=new StudentInter() {
//            @Override
//            public void display() {
//                System.out.println("Hello world");
//            }
//        };
//
//        i.display();

//        StudentInter s =  () -> {System.out.println("Hello World");};
//        s.display();

        StudentInter<String> s= data-> System.out.println("String data is "+data);

        StudentInter<Integer> intDisplay    = v -> System.out.println("Integer: " + v);

intDisplay.display(45);
s.display("ketan");
    };
}
