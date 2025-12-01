package java2102025.impor;

public class MultithreadingPractice  extends  Thread{

    @Override
    public void run() {
        System.out.println("First thread");

    }

    public static void main(String[] args) {
        MultithreadingPractice m=new MultithreadingPractice();
        m.start();
        System.out.println("Main Thread");
    }
}
