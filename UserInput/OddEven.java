package UserInput;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num1 =sc.nextInt();
        if(num1 %2 == 0)
        {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
