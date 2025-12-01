package LambdaExpression;

public class MultipleOperation {
    public static void main(String[] args) {
        MultipleFunc add = (x,y) ->  x+y;
        MultipleFunc multi = (x,y) ->  x*y;

        System.out.println();
        System.out.println(add.operations(10,4));
        System.out.println(multi.operations(23,11));


    }
}
