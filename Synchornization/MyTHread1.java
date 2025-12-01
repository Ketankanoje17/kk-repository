package Synchornization;

public class MyTHread1 extends Thread {
   private Counter counter;

    public MyTHread1(Counter c) {
        counter =c;
    }

    @Override
    public  void run(){
        for(int i=0;i<1000;i++)
        {
            counter.increment();
        }

    }
}
