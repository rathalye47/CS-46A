/**
 * Class to practice finding errors
 * @author Rohan Athalye
 * version with errors
 */

public class StringTester
{
   public static void main(String[] args)
   {
      String language = "Java";
      System.out.println(language);
      System.out.println("Expected: Java");
      System.out.println(language.length());
      System.out.println("Expected: 4");
      System.out.println(language.substring(0, 1));
      System.out.println("Expected: J");
   }
}