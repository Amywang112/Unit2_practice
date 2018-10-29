public class Ch6Boolean
{ 
   // Exercise 6.2
   public static boolean isDivisible(int n, int m) {
       
       if (n % m == 0){
           return true;
        } else {
           return false;
        }      
       // return (n % m) == 0
   } 
   
   // Exercise 6.3
   public static boolean isTriangle (int x, int y, int z){
       if (x + y < z) {
           return false;
        } else if (y + z < x) {
           return false;
        } else if (x + z < y) {
           return false;
        } else {
           return true;
        }
       // return !(x + y < z) || (y + z < x) || (x + z < y);
    }
}
