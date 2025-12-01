package numbersprograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int number=50;
        int count=0;


        for(int i=2;i<=number;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    isPrime=false;
                    break;
                }

            }
            if(isPrime)
            {
                System.out.println("prime number is :" +i+ " and count is "+count);
                count++;
            }
        }

    }
}
