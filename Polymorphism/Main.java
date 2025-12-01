package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Bank b=new Sbi();
        System.out.println("bank sbi rate of interest : "+b.rateOfinterestbank());

        Bank b1=new Hdfc();
        System.out.println("bank hdfc rate of interest : "+b1.rateOfinterestbank());

        Bank b2=new Axis();
        System.out.println("bank axis rate of interest : "+b2.rateOfinterestbank());

    }
}
