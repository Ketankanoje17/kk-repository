import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    int i = 1;
    int fact = 1;

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Enter the number: " + num);
    while (i <= num) {
      fact = fact * i;
      i++;
    }
    System.out.println(fact);
  }
}
