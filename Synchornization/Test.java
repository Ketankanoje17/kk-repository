package Synchornization;

public class Test {
    public static void main(String[] args) {
        Counter c=new Counter();
        MyTHread1 tHread1=new MyTHread1(c);
        MyTHread1 tHread2=new MyTHread1(c);

        tHread1.start();
        tHread2.start();


        try{
            tHread2.join();
            tHread1.join();
        }catch (Exception e)
        {

        }
        System.out.println(c.getCout());
    }
}
