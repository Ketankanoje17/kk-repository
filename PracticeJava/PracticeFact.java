package PracticeJava;

import java.util.Scanner;

public class PracticeFact {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
      for(int i=1;i<=number;i++)
        {
          fact =fact*i;
        }
        System.out.println(fact);
    }
}
