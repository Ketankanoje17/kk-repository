package UserInput;

public class ValidationExample {
    public static void main(String[] args) {
        String name="ketan";

    if(name.isEmpty() == true)  //check condition equal or not
    {
        System.out.println("name is empty");
    }else{
        System.out.println("not empty");
    }


        String rollNo="  ketan    ";

    if(rollNo.trim().length() == 0)
    {
        System.out.println("roll no is empty");
    }else{
      int size =  rollNo.trim().length();
        System.out.println("not empty"+size);
    }
        System.out.println(rollNo.trim());

        String s3="ketan";
        String s4="Ketan";

        if(s3.equals(s4))
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(s3.equalsIgnoreCase(s4))
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        String s5="a";
        String s6="A";

        System.out.println(s5.compareTo(s6));

        String s8="ketan is great";

        System.out.println(s8.replace("is","in future  is"));

        String name1="ketannnanna";
        System.out.println(name1.indexOf("a")); //integer
        System.out.println(name1.lastIndexOf("n")); //integer
        System.out.println(name1.charAt(4)); // character
        System.out.println(name1.contains("ep")); //boolean
        System.out.println(name1.startsWith("k")); //boolean -- first charcayter check
        System.out.println(name1.endsWith("k")); //boolean -- first charcayter check

        // toUppercase toLowercase toString  toCharArray
        String s9="ketan kanoje";
        int a=13; int b=11;
        System.out.println(s9.toLowerCase());
        System.out.println(s9.toUpperCase());
        String s11=String.valueOf(a);
        String s12=String.valueOf(b);
        System.out.println(s11+s12);

        char[] ch= s9.toCharArray();
        System.out.println(ch);
    }
//compare to compare decimal/lexicographical value or character compare
}


