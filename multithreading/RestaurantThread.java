package multithreading;

public class RestaurantThread extends  Thread{
    private String task;

    RestaurantThread(String task)
    {
        this.task=task;
    }

    @Override
    public void run() {
        System.out.println(task + "beign prepared chef by " + Thread.currentThread().getName());
    }
}
