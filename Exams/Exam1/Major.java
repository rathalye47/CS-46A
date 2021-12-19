
import java.util.Scanner;

/**
 * Models using a Scanner with the Major Class.
 *
 * @author Rohan Athalye
 * 
 */
public class Major
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your major? ");
        String major = scan.nextLine();

        System.out.println(major.length());

        System.out.println(major);

        if (major.length() >= 3)
        {
            System.out.println(major.substring(0, 3));
        }

        else
        {
            System.out.println(major);
        }

        major = major.toLowerCase();

        if (major.equals("computer science"))
        {
            System.out.println("You get an A");
        }

        else if (major.equals("pre med"))
        {
            System.out.println("We need more doctors");
        }

        else
        {
            System.out.println("A good field of study");
        }

    }
}
