import java.util.Scanner;

/**
 * Input validation for real.
 */

public class GiveMeAnInteger
{
    public static void main() {
        // ask for an integer
        Scanner in = new Scanner(System.in);
        System.out.print("Give me an integer. ");
        int count = 1;
        
        // while next line isn't an integer
        while(!in.hasNextInt())
        {
            // clear line, reprompt
            in.nextLine();
            System.out.print("I said give me an integer. ");
            count ++;
        }
        
        // the user finally complies
        System.out.println("Thanks, that took you " + count + " times.");
    }
}