package java2102025.test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateOccurance {
    public static void main(String[] args) {
        String data="dfsdafsfsdafsdf";

        HashMap<Character,Integer> hp=new HashMap<>();

        for(char ch:data.toCharArray())
        {
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> HS: hp.entrySet())
        {
            System.out.println("key is : "+HS.getKey()+ "and valus is : "+HS.getValue());
        }
    }
}
