
import java.util.Scanner;

/**
 * Models a Scanner asking for a favorite holiday.
 *
 * @author Rohan Athalye
 *
 */
public class Holidays
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your favorite holiday? ");
        String favoriteHoliday = scan.nextLine();

        System.out.println(favoriteHoliday);
        System.out.println(favoriteHoliday.toLowerCase());
        favoriteHoliday = favoriteHoliday.toLowerCase();

        if (favoriteHoliday.equals("thanksgiving"))
        {
            System.out.println("It is good to be thankful");
        }

        else if (favoriteHoliday.equals("new year's day"))
        {
            System.out.println("The start of a new year");
        }

        else if (favoriteHoliday.equals("president's day"))
        {
            System.out.println("Any excuse for a vacation is good");
        }

        else
        {
            System.out.println("Are you sure that is a holiday?");
        }
        
        System.out.println(favoriteHoliday);
    }
}
