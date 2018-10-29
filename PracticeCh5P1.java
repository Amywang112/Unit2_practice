import java.util.Scanner;

public class PracticeCh5P1
{  
   // public static void main()
   // {
       // // Exercise 5.1
       // float x = 5;
       
       // if ( x > 0 && x < 10){
           // System.out.println ("positive single digit number.");
       // } else {
           // System.out.println ("positive non single digit number.");
       // }
       
       
   // }
   
   
   public static void main(String[] args) {
       int bizz = 5;
       int buzz = 2;
       zoop("just for", bizz);
       clink(2 * buzz);
   }
   
   public static void zoop(String fred, int bob) {
       System.out.println(fred);
       if (bob == 5) {
        ping("not ");
       } else {
        System.out.println("!");
       }
   }
   
   public static void clink(int fork) { 
       System.out.print("It's "); zoop("breakfast ", fork);
   }
   
   public static void ping(String strangStrung) {
       System.out.println("any " + strangStrung + "more ");
    }
    
}
