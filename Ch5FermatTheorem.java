import java.util.Scanner;

public class Ch5FermatTheorem
{  
   static double a;
   static double b;
   static double c;
   static double n;
  
   public static void main()
   {
       Scanner input = new Scanner(System.in);
       System.out.println ("Let's check Fermat's Theorem of a^n + b^n = c^n!");
       System.out.print ("the value of integer a is: ");
       a = input.nextInt();
       System.out.print ("the value of integer b is: ");
       b = input.nextInt();
       System.out.print ("the value of integer c is: ");
       c = input.nextInt();
       System.out.print ("the value of integer n is (has to be greater than 2): ");
       n = input.nextInt();
       
       checkFermat();
    }
   
   public static void checkFermat()
   {
       if (n > 2 && (Math.pow(a,n) + Math.pow (b,n)) == Math.pow (a,c)){
           System.out.println ("Holy smokes, Fermat was wrong!");
       } else if (n <=2) {
           System.err.println ("Error: n needs to be greater than 2!!");
           return;
       } else {
           //System.out.println (AB + " does not equal " + C);
           System.out.println ((Math.pow(a,n) + Math.pow (b,n)) + " does not equal " + Math.pow (a,c));
           System.out.println ("No, that doesn’t work.");
       }
       
   }
   
}