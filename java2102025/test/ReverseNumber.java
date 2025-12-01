package java2102025.test;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=123322;
        int rev = 0;

        while(number != 0)

        {
          int res=number % 10;
          rev= rev*10+res;
          number=number/10;
        }
        System.out.println(rev);
    }
}
