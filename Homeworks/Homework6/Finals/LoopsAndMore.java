
import java.util.Scanner;

/**
 * Experiments with loops to get valid input.
 * @author Rohan Athalye
 */
public class LoopsAndMore
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int integer1 = 0;

        do
        {
            System.out.print("Enter an integer less than 10 ");
            integer1 = scan.nextInt();
        }

        while (integer1 >= 10);

        double double1 = 0.0;

        do
        {
            System.out.print("Enter a double between 1 (inclusive) and 50 (exclusive)" );
            double1 = scan.nextDouble();
        }

        while (double1 < 1 || double1 >= 50);
        
        System.out.println(double1);

        double product = integer1 * double1;
        System.out.println(product);

        int productIntegerPortion = (int) (integer1 * double1);
        System.out.println(productIntegerPortion);

    }
}
