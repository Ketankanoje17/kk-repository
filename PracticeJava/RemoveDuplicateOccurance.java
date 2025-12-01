package PracticeJava;

import java.util.HashSet;

public class RemoveDuplicateOccurance {
    public static void main(String[] args) {
        String s="ketanakdksdaf";

        HashSet<Character> hs=new HashSet<>();
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray())
        {
            if(!hs.contains(ch))
            {
                hs.add(ch);
                sb.append(ch);
            }
        }
        System.out.println("Original String is: "+s);
        System.out.println("the remove occurace aare: "+sb);
    }
}
