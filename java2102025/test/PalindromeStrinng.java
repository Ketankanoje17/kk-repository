package java2102025.test;

public class PalindromeStrinng {
    public static void main(String[] args) {
        String str="kaka";
        String rev="";
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            rev= rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
