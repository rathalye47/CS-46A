
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
    }
}
