package PracticeJava;

import java.util.HashMap;
import java.util.Map;

public class countDuplicateOccurance {
    public static void main(String[] args) {
        String words="dafdffsfdsdafsf";

        HashMap<Character,Integer> hp=new HashMap<>();

        for(char ch:words.toCharArray())
        {
            hp.put(ch, hp.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> hs: hp.entrySet())
        {
            System.out.println("entry key is: "+hs.getKey()+ "and value is: "+hs.getValue());
        }
    }
}
