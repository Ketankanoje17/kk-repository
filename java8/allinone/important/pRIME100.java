package java8.allinone.important;

import java.util.Scanner;

public class pRIME100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        
        for(int i=2;i<=num;i++)
        {
            boolean isPrime = true;

            for(int j=2;j<=i/2;j++ ) {
              if (i % j == 0) {
                  isPrime = false;
                  break;
              }


          }
            if (isPrime) {
                System.out.println("prime number is + "+i+"  count = " + count);
                count++;
            }
        }



    }
}
