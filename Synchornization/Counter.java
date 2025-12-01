package Synchornization;

public class Counter {

    private int count=0;

    public synchronized void increment()
    {
        count++;
    }
    public int getCout()
    {
        return count;
    }
}
