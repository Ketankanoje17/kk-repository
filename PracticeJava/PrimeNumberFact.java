package PracticeJava;

import java.util.Scanner;

public class PrimeNumberFact {
    public static void main(String[] args) {
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number= sc.nextInt();
        while(number > 0)
        {
            int div=number % 10;
            reverse=reverse*10+div;
            number += number / 10;

        }
        System.out.println(reverse);
    }
}
