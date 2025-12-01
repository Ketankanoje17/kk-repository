package UserInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumberOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");
        String s=sc.nextLine();


        HashMap<Character,Integer> count=new HashMap<>();

        for(char ch :s.toCharArray())
        {
            if(count.containsKey(ch))
            {
               count.put(ch, count.getOrDefault(ch,0)+1);
            }else {
                count.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : count.entrySet())
        {
            System.out.println("Key is : "+entry.getKey() + ":and value is "+entry.getValue());
        }
    }
}
