package java2102025;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String wordsdata="ketan kanoje";
        String reverse=ReverseSTringData(wordsdata);
        String reverse2=ReverseSTringData2(wordsdata);
        System.out.println(reverse2);
        System.out.print(reverse);
    }
  public static String ReverseSTringData(String data)
  {
      String  reverse= "";
     char[] ch=data.toCharArray();
      for(int i=ch.length-1;i>=0;i--)
      {
          reverse += ch[i];
      }
      return reverse;
  }

  public static String  ReverseSTringData2(String data)
  {
      String reverse="";
      StringBuilder sb=new StringBuilder();
      for(int  i=data.length()-1;i>=0;i--)
      {
       sb.append(data.charAt(i));
      }
      return sb.toString();
  }

}
