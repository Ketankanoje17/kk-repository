package java2102025.impor;

public class MultipleThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread runnable");
    }

    public static void main(String[] args) {
        MultipleThreadRunnable r=new MultipleThreadRunnable();

        Thread th1=new Thread(r);
        th1.start();

    }
}
