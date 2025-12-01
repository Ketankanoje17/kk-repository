package UserInput;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num1 = sc.nextInt();

        if(num1 > 0)
        {
            System.out.println("Its possitive number");
        } else if (num1 == 0) {
            System.out.println("Its is 0 number");

        }else{
            System.out.println("Its negative number");
        }
    }
}
