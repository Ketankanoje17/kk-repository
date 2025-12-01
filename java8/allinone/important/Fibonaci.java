package java8.allinone.important;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int num=0;int num1=1;

        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();

        for(int i=2;i<=input;i++)
        {
            int num3=num+num1;
            System.out.println(num3);
            num=num1;
            num1=num3;
        }
    }
}
