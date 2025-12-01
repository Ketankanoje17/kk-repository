package UserInput;

import java.util.Scanner;

public class RateOfInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principle data...\n");
        System.out.print("enter the Principle data: ");
        double p=sc.nextInt();
        System.out.print("enter the Rate: \n");
        double r=sc.nextInt();

        System.out.print("enter the Year: ");
        double year=sc.nextInt();

        double triangle=(p*r*year)/100;
        System.out.println("Base of triangle is: " +triangle);

    }
}
