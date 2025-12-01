package StringJavaprogram;

public class CalculateTargate {
    public static void main(String[] args) {
        String ab2="abaabcaass";
        String target="aa";
        int count=0;

        for(int i=0;i<ab2.length()-target.length();i++)
        {
            if(ab2.substring(i,i+target.length()).equals(target))
            {
                count++;
            }
        }
        System.out.println("the aa count is :" +count);
    }
}
