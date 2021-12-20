
import java.util.Scanner;

/**
 * Get a set of elevations and print some info about them.
 * I received some help from Piazza Post @686 to come up with the declaration/initialization of lowestElevation to Double.MAX_VALUE, which is the highest possible value a double can represent.
 * @author Rohan Athalye
 */
public class TheSentinel
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double elevation = 0.0;
        int numLocationsBelow0 = 0;
        double totalElevation = 0.0;
        int numOfElevations = 0;
        double lowestElevation = Double.MAX_VALUE;

        System.out.print("Enter an elevation or Q to quit: ");

        if (scan.hasNextDouble())
        {
            while (scan.hasNextDouble())
            {           
                elevation = scan.nextDouble();

                if (elevation < lowestElevation)
                {
                    lowestElevation = elevation;
                }

                if (elevation < 0.0)
                {
                    numLocationsBelow0 = numLocationsBelow0 + 1;
                }

                totalElevation = totalElevation + elevation;
                numOfElevations = numOfElevations + 1;

                System.out.print("Enter an integer or Q to quit: ");
            }

            double average = 0;

            if (numOfElevations > 0)
            {
                average = totalElevation / numOfElevations;
            }

            System.out.println(numLocationsBelow0);
            System.out.println(lowestElevation);
            System.out.println(average);
        }

        else
        {
            System.out.println("no input");
        }

    }
}
