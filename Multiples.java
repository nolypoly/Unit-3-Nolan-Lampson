import java.util.Scanner;

public class Multiples {
  public static void main (String[]args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a positive integer");
  int VALUE = scan.nextInt();
  System.out.println("Enter an upper limit");
  int LIMIT = scan.nextInt();
  int MULT = 0;
  for (MULT = VALUE; MULT <= LIMIT; MULT+=VALUE);
  System.out.println("Multiples of " + VALUE + " are: " + MULT);
  
  }
}
