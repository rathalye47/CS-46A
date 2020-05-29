import java.util.Random;

/**
 * Models a random number generator with static methods.
 * @author Rohan Athalye
 */
public class MyRandom
{
   private static Random gen;
   
   public MyRandom()
   {
       gen = new Random();
   }
    
   public static int generateInteger(int m, int n)
   {
       int randomNumber = (int) (Math.random() * (n - m) + m);
       return randomNumber;
   }
   
   public static double generateDouble(double x, double y)
   {
       return x + Math.random() * (y - x);
   }
}
