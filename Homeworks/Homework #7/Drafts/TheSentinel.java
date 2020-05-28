
import java.util.Scanner;

/**
 * Get a set of elevations and print some info about them
 * @author Rohan Athalye
 */
public class TheSentinel
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double elevation = 0.0;
        int numLocationsBelow0 = 0; 

        System.out.print("Enter an elevation or Q to quit: ");

        if (scan.hasNextDouble())
        {
            while (scan.hasNextDouble())
            {           
                elevation = scan.nextDouble();

                if (elevation < 0.0)
                {
                    numLocationsBelow0 = numLocationsBelow0 + 1;
                }

                System.out.print("Enter an integer or Q to quit: ");
            }

            System.out.print(numLocationsBelow0);
        }

        else
        {
            System.out.println("no input");
        }

    }
}