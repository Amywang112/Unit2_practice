 public class Ch6Multadd
{ 
   public static void main(String[] args) {
       double result1 = Multadd (1.0, 2.0, 5.0);
       System.out.println ("Test result is " + result1);
       double result2 = Multadd (Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
       System.out.println ("sin(pi/4) + cos(pi/4)/2 =" + result2);
       double result3 = Multadd (Math.log(10), 1, Math.log(20));
       System.out.println ("log10 + log20 = " + result3);
   }

   public static double expSum (double x){
       double result = Multadd (x, Math.pow(Math.E, -x), Math.sqrt(1 - Math.pow(Math.E, -x)));
       return result;
   }
   
   public static double Multadd(double a, double b, double c) {
       double result = a * b + c;
       return result;
   } 
   
}