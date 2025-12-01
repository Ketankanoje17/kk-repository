package java8;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueStringArr {
    public static void main(String[] args) {
        String str[]={"ketan","kanoje","nayana","kanoje"};

        HashSet<String> hs=new HashSet<>(Arrays.asList(str));
        System.out.println(hs);

        //2
        for(int i=0;i<str.length;i++)
        {
            boolean isTrue=true;
            for(int j=0;j<str.length;j++)
            {
                if( i!=j && str[i].equals(str[j]))
                {
                    isTrue=false;
                    break;
                }
            }
            if(isTrue)
            {
                System.out.println(str[i]);
            }
        }
    }


}
