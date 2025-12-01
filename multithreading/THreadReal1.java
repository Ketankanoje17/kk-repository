package multithreading;

public class THreadReal1 extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        THreadReal1 t1=new THreadReal1();
        t1.start();
    }
}
