package LambdaExpressionTur.work;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
     MyInter m =new MyInterImple();
     m.sayHello();

     MyInter  m2=new MyInter() {
         @Override
         public void sayHello() {
             System.out.println("Hello second expression");
         }
     };
     m2.sayHello();

        MyInter  m3=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("Hello thrids expression");
            }
        };
        m3.sayHello();

        MyInter i = () ->{
            System.out.println("this is lambda expression call");
        };
        i.sayHello();

        MyInter i2 = () ->
            System.out.println("second lambda exprsion");
              i2.sayHello();
            //  SumInter sumInter = (int a,int b) -> {return a+b;};
        SumInter sumInter = (a, b) -> { return a+b;};
        System.out.println(sumInter.sum(11,12));
    }
}
