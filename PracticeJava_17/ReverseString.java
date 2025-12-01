package PracticeJava_17;

public class ReverseString {
    public static void main(String[] args) {
        String s="Ketan";
       char[] len=s.toCharArray();
        String rev="";

        for(int i=len.length-1;i>=0;i--)
        {
            rev=rev + len[i];
        }
        System.out.println(rev);
    }
}
