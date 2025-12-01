import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder(s);
       String reverse = sb.reverse().toString();
        System.out.println("reverse string is "+reverse);

        //

        for(int i=s.length()-1;i>0;i++)
        {
          s=s+s.charAt(i);
        }

        System.out.println("Original characete is "+s);
        System.out.println("Reverse character is "+s);


        int lengt=s.length();
        if(lengt >= 0)
        {
            s=s+s.charAt(lengt);
            lengt--;
        }
        System.out.println("Original characete is "+s);
        System.out.println("Reverse character is "+s);
    }

}
