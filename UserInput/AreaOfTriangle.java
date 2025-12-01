package UserInput;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the complete data...\n");
        System.out.print("enter the base: ");
        double base=sc.nextInt();
        System.out.print("enter the height: ");
        double height=sc.nextInt();

        double triangle=0.5*base*height;
        System.out.println("Base of triangle is: " +triangle);

    }
}
