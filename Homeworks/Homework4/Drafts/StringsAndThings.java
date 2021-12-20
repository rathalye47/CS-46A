
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
    }
}
