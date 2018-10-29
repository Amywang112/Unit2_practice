import java.util.Scanner;

public class example1
{
   public static void main()
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Give me an integer: ");
       
       if (!input.hasNextInt()){
           System.out.println("THAT'S NOT A INTEGER.");
           return;
        }
        
       int n = input.nextInt();
       System.out.println ("I LOVE INTEGER " + n);
    }
}
