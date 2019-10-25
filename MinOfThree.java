import java.util.Scanner;

public class MinOfThree {
  public static void main (String[]args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter three integer values:");
    int first = scan.nextInt();
    int second = scan.nextInt();
    int third = scan.nextInt();

    if (first < second && first < third)
      System.out.println("The smallest integer is " + first);
    if (second < first && second < third)
      System.out.println("The smallest integer is " + second);
    if (third < first && third < second)
      System.out.println("The smallest integer is " + third);
  }
}
