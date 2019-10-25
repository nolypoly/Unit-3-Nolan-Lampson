import java.util.Scanner;
public class WinPercentage {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number of games played:");
      int GamesPlayed = scan.nextInt();
      System.out.println("Enter number of games won:");
	    int GamesWon =  scan.nextInt();
      double WinPercent = ((double) GamesWon / (double) GamesPlayed *100.0);
      while (GamesPlayed >= GamesWon && GamesPlayed > 0 && GamesWon >= 0) {
        System.out.println("Your win percentage is: " +  WinPercent + "%");
        }
  }
}
