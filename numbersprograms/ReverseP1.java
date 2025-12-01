package numbersprograms;

public class ReverseP1 {
    public static void main(String[] args) {
        int num=652442;
        int rev=0;

        while(num!=0)
        {
            int res=num % 10;
            rev=rev * 10 + res;
            num /=10;
        }

        System.out.println(rev);
        String rev1=String.valueOf(num);

        StringBuilder sb=new StringBuilder(rev1);

        System.out.println(sb.reverse());
    }
}
