package java8.allinone;

public class ReversWords {
    public static void main(String[] args) {
        String s="ketan kanoje";
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {

            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb);    }
}
