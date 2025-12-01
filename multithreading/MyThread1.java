package multithreading;

public class MyThread1 extends Thread{
    public  void run()
    {
        System.out.println("Executing THread Run 1");
    }
}
class MyThreD2 extends Thread{
    public  void run()
    {
        System.out.println("Executing THread Run 2");
    }
}

class MainThread{
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThreD2 t2= new MyThreD2();
        t2.start();
        t1.start();
    }
}