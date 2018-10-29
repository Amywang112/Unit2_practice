import java.util.Scanner;
import java.util.Random;
/**
 * Nim is a game that proceeds as following:
 * 1.An assigned number of sticks (>= 1) are placed in a row.
 * 2.Two players alternate turns picking up one or two sticks.
 * 3.The player who picks up the last stick loses.
 * 
 * The user can choose to play with another player or AI.
 *
 * @author Liz and Amy
 * @version 10/29/17
 */
public class WithErrorMessageNim{
    static Scanner in = new Scanner(System.in);
    static int countStick;
    static int roundCount = 0;
    static int mode = 0;
    
    public static void main (String[] args) {
       System.out.println("\nWelcome to NIM!");
       System.out.println("Here are the rules:\n   1.An assigned number of sticks (>= 1) are placed in a row.\n   2.Two players alternate turns picking up one or two sticks.\n   3.The player who picks up the last stick loses.");
       System.out.println("Enter number to select mode:\n    1. Two players\n    2. Play with AI");
       //User chooses to play with another player or AI
       mode = in.nextInt();
       if (mode != 1 && mode != 2){
           System.err.print("Error: Invalid mode selection");
           String[] arguments = new String[]{"Liz and Amy"};
           WithErrorMessageNim.main(arguments);
        } else if (mode == 2) {
            System.out.println("You will be Player 1 while the AI will be Player 2");
        }
       //Asks user for intial output
       System.out.println("How many sticks do you want to start with?");
       countStick = in.nextInt();
       //If user puts in 0 or 1 initially (which blocks the game from proceeding), 
       //the system prints an error message and restart the whole game.
       if (countStick == 0 || countStick == 1) {
           System.err.println("Error: Invalid initial input\n");
           String[] arguments = new String[]{"Liz and Amy"};
           WithErrorMessageNim.main(arguments);
       } else {
           removeStick(0); //print out the number of sticks chosen
           while (countStick != 1){
               roundCount++;
               if (roundCount % 2 == 1) { //Player 1's round
                   System.out.print("Player 1 removes how many sticks? ");
                   int playerRemove = in.nextInt();
                   inputVerify(playerRemove);
                   if (countStick == 1){//Determines winner
                       System.out.println("Player 1 wins!");
                       break;
                   }
               } else {//Player 2's round
                   if (mode == 1) {//Two players
                       System.out.print("Player 2 removes how many sticks? ");
                       int playerRemove = in.nextInt();
                       inputVerify(playerRemove);
                   } else {//Play with AI (random generates number)
                       Random random = new Random();
                       int playerRemove = (int)(Math.random()*2)+1;
                       System.out.println("AI removes " + playerRemove + " sticks.");
                       inputVerify(playerRemove);
                   }
                   if (countStick == 1){//Determines winner
                       System.out.println("Player 2 wins!");
                       break;
                   }
               }
           }
       }
    }
    
    //Method to remove input number of sticks
    public static void removeStick(int input) {
            if (input < countStick) {//make sure the input is smaller than current number of sticks
            int count = 0;
            for (int i = 0; i <(countStick - input); i++){
                System.out.print("|");
                count++;
            }
            System.out.println(" ");
            countStick = count;
            System.out.println("There are " + countStick + " sticks left!\n");
        } else {//error message
            System.err.print("Error: Input equals current stick count.");
            String[] arguments = new String[]{"Liz and Amy"};
            WithErrorMessageNim.main(arguments);
        }
    }
    
    //Verifies if user only put in 1 or 2 sticks to remove
    public static void inputVerify(int input) {
        if (input == 1 || input == 2) {//removes stick
            removeStick(input);
        } else {//error message
            System.err.println("Error: You should only be removing 1 or 2 sticks at a time.");
            String[] arguments = new String[]{"Liz and Amy"};
            WithErrorMessageNim.main(arguments);
        }
    }
}