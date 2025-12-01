import java.util.HashSet;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String s="Helldfsafsdaf";
        String result="";

        HashSet<Character> hash=new HashSet<>();
        for(char ch : s.toCharArray())
        {
             if(hash.add(ch))
             {

                 result=result+ch;
             }
        }
        System.out.println("Original value "          +s);
        System.out.println("Duplicate Values removes "+result);
    }
}
