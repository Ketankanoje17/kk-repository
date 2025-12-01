package java8.allinone.important;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
        int num[]={3,44,55,34,34,22,11,21,33,33};

//        for(int i=0;i<num.length;i++)
//        {
//            for(int j=i+1;j<num.length;j++)
//            {
//                if(num[i] == num[j])
//                {
//                    System.out.println("duplicate number is :"+num[j]);
//                }
//            }
//        }
      //  Set<Integer> data=new HashSet<>();
//      Arrays.stream(num)
//                .boxed()
//                .filter(n-> !data.add(n))
//              .map(n->n+" ")
//                .forEach(System.out::print);
//        System.out.println("\n");
      HashSet<Integer> newList=new HashSet<>();
      for(int dat:num)
      {
        if(!newList.add(dat))
        {
            System.out.println("dupicate element is : "+dat);
        }
      }

    }


}
