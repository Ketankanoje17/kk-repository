package Polymorphism.MethodOverloading;

public class customerMain {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.searchCustomer(11);
        c.searchCustomer("ketan");
        c.searchCustomer("kkk",122);
    }
}
