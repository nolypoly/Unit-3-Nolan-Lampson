import java.util.Scanner;

public class DrinkingAge {
  public static void main (String[]args) {
  Scanner scan = new Scanner (System.in);
  int age = scan.nextInt();
  System.out.println ("Enter your age");
if (age <= 21) {
    System.out.println("Old enough to drink and drive (not simultaneously");
  }
else
 {
    System.out.println("Can drive, cannot drink");
  }
}
}
