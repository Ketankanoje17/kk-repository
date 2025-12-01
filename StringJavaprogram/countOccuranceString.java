package StringJavaprogram;

import java.util.HashMap;
import java.util.Map;

public class countOccuranceString {
    public static void main(String[] args) {
        String s1="ketan kanoje";
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char ch:s1.toCharArray())
        {
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> entry:hp.entrySet())
        {
            System.out.println("the entry key is : "+entry.getKey()+ "and value count is : "+entry.getValue());
        }
    }
}
