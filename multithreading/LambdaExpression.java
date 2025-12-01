package multithreading;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        }


        Runnable runnable1 = () -> {
            System.out.println("Hello");
        };

        Thread  t1 = new  Thread(runnable1);
        t1.start();


    }
}
//Runnable is a funtional interface
// single abstract method call function interface - only one abstract method called run() method threading
//lambda is anonymous function