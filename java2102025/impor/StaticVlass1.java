package java2102025.impor;

public class StaticVlass1 {

     int a=20;
     public void display()
     {
         System.out.println(a);
     }
    public static int square(int num)
    {
        return num*num;
    }
    public static void main(String[] args) {
         StaticVlass1 a=new StaticVlass1(); //normal
        int res=StaticVlass1.square(11); //static
        System.out.println(res);
        a.display();
    }
}
