package UserInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElementFound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value : ");
        String s=sc.nextLine();
        HashMap<Character,Integer> hs=new HashMap<>();

for(char ch:s.toCharArray())
{
    if(hs.containsKey(ch))
    {
        hs.put(ch,hs.get(ch)+1);
    }else {
        hs.put(ch,1);
    }
}

        System.out.println("Duplicate data ");

for(Map.Entry<Character,Integer> entry :hs.entrySet())
{
    if(entry.getValue() > 1)
    {
        System.out.println(entry.getKey()+"_"+entry.getValue()+"_");
    }
}

    }
}
