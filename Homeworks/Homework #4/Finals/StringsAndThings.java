
import java.util.Scanner;

/**
 * Experiments using Scanner with StringsAndThings.
 *
 * @author Rohan Athalye
 *
 */
public class StringsAndThings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a few words: ");
        String phrase = input.nextLine();
        System.out.println(phrase);
        System.out.println(phrase.charAt(phrase.length() - 1));
        
        int indexOfSpace = phrase.indexOf(" ");
        String firstWord = phrase.substring(0, indexOfSpace);
        System.out.println(firstWord);
        
        System.out.print("Enter a word, a space, and an integer: ");
        String theWord = input.next();
        int theInteger = input.nextInt();
        
        System.out.print("Enter a double: ");
        double theDouble = input.nextDouble();
        
        double sum = theDouble + theInteger;
        System.out.println(sum);
        
        System.out.println(theWord);
    }
}
