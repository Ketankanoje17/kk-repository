package multithreading;

public class MyRestaurant {
    public static void main(String[] args) {
        RestaurantThread t1=new RestaurantThread("chinease");
        RestaurantThread t2=new RestaurantThread("nonveg");
        RestaurantThread t3=new RestaurantThread("maggie");
        t1.start();
        t2.start();
        t3.start();




    }
}
