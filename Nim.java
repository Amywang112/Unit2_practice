import java.util.Scanner;

/**
 * Nim is a 
 *
 * @author (Liz and Amy)
 * @version (10/23/17)
 */
public class Nim
{
    static Scanner in = new Scanner(System.in);
    static int countStick;
    static int roundCount = 0;
    
    public static void main() {
        System.out.println("Hey! How many sticks would you want to start with?");
        countStick = in.nextInt();
        removeStick(0); //print out the number of sticks chosen

        while (countStick != 1){
               roundCount++;
               if (roundCount % 2 == 1) {
                   System.out.print("Player 1 removes how many sticks? ");
                   int playerRemove = in.nextInt();
                   removeStick(playerRemove);
                   if (countStick == 1){
                        System.out.println("Play 1 wins!");
                   }
                } else {
                   System.out.print("Player 2 removes how many sticks? ");
                   int playerRemove = in.nextInt();
                   removeStick(playerRemove);
                    if (countStick == 1){
                        System.out.println("Player 2 wins!");
                    }
                }
        }
    }
    
    //General method to remove sticks
    public static int removeStick(int input) {
        int count = 0;
        for (int i = 0; i <(countStick - input); i++){
            System.out.print("|");
            count++;
        }
        System.out.println(" ");
        countStick = count;
        return countStick;
    }
}
