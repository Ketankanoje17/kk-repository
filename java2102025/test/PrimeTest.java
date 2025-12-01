package java2102025.test;

public class PrimeTest {
    public static void main(String[] args) {
        int prime=50;
        int count = 0;
        
        for(int i=2;i<=prime;i++)
        {
            boolean isPrime=true;
            for (int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j == 0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("prime number is : " +i+ "and count is: "+count);
                count++;
            }
        }
    }
}
