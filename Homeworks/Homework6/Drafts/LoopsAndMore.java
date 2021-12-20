
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
        double sum = 0;
        int integer = 0;

        for (int i = 1; i <= 3; i++)
        {
            System.out.print("Enter an integer: ");
            integer = scan.nextInt();
            sum = sum + integer;
        }
        
        System.out.println(sum);

    }
}
