package LambdaExpressionTur.work;

public class ThreadDemo {
    public static void main(String[] args) {
        //first thread  -john
        Runnable thread1=()->{
            //this is body of the thread
            for(int i=1;i<=10;i++)
            {
                System.out.println("value of i is " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t1=new Thread(thread1);
        t1.setName("Ketan");
        t1.start();

    }
}
