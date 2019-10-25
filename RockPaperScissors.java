import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Do you want to play? Enter y or n");
    String Play = scan.nextLine();

    while (stringPlay.equals("y")) {
    System.out.println("Please enter one of the following: 0, 1, 2");
    System.out.println("0 is Rock, 1 is Paper, 2 is Scissors");
    int USER_INPUT = scan.nextInt();
    System.out.println("You chose " + USER_INPUT);
    int ROCK = 0;
    int PAPER = 1;
    int SCISSORS = 2;
    int Games_Played = 0
    int Games_Won = 0
    //1 def. 0, 2 def. 1, 0 def. 2
    Random rand = new Random();
    int PROG_INPUT = rand.nextInt(3);
    System.out.println("The computer chose " + PROG_INPUT);
        if(USER_INPUT == 1 && PROG_INPUT == 0) {
        System.out.println("YOU WIN! Paper defeats Rock");
        Games_Played++;
        Games_Won++;
        }
        else if (USER_INPUT == 0 && PROG_INPUT == 2) {
        System.out.println("YOU WIN! Rock defeats Scissors");
        Games_Played++;
        Games_Won++;
        }
        else if (USER_INPUT == 2 && PROG_INPUT == 1){
        System.out.println("YOU WIN! Scissors defeats Paper");
        Games_Played++;
        Games_Won++;
        }
        else if(USER_INPUT == PROG_INPUT ){
        System.out.println("TIE! Please try again");
        Games_Played++;
        }
        else if(USER_INPUT == 0 && PROG_INPUT == 1){
        System.out.println("YOU LOSE! Paper defeats Rock");
        }
        else if (USER_INPUT == 2 && PROG_INPUT == 0) {
        System.out.println("YOU LOSE! Rock defeats Scissors");
        }
        else if (USER_INPUT == 1 && PROG_INPUT == 2){
        System.out.println("YOU LOSE! Scissors defeats Paper");
        }
        System.out.println("Do you want to play again? Enter y or n");
        String replay = scan.nextLine();
    }
    //end of while loop
    while (Play.equals"n");
    System.out.println("Thanks for playing!");
