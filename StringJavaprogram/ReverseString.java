package StringJavaprogram;

public class ReverseString {
    public static void main(String[] args) {
        String word="hello";

        char[] ch=word.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        System.out.println(" ");
        for(int i=word.length()-1;i>=0;i--)
        {
            System.out.print(word.charAt(i));
        }
StringBuilder sb=new StringBuilder(word);
        System.out.print(sb.reverse());
     }
}
