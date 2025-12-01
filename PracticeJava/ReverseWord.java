package PracticeJava;

public class ReverseWord {
    public static void main(String[] args) {
        String word="ketan kanoje";
        String[] rev =word.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=rev.length-1;i>=0;i--)
        {
            sb.append(rev[i]).append(" ");
            System.out.println(sb.toString().trim());
        }
    }
}
