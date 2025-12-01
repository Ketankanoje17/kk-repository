package multithreading;

public class MyTHread2 extends Thread{

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello Ketan");
        }
    }

    public static void main(String[] args) {
        MyTHread2 tHread2=new MyTHread2();
        tHread2.setDaemon(true);
        MyTHread2 myTHread2=new MyTHread2();
        myTHread2.start();
        System.out.println("main done");
    }
}
