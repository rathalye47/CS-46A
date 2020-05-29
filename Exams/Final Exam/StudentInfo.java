import java.util.Scanner;

/**
 * Models Student Information.
 * @author Rohan Athalye
 */
public class StudentInfo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your educational goal? ");
        String goal = scan.nextLine();

        System.out.println(goal);
        System.out.println(goal.length());

        System.out.print("How many years have you been at SJSU? ");

        if (scan.hasNextInt())
        {
            int years = scan.nextInt();

            System.out.print("How much student debt do you have? ");

            if (scan.hasNextDouble())
            {
                double debt = scan.nextDouble();

                if (years != 0)
                {
                    double average = debt / years;
                    System.out.println(average + " per year");
                }
            }

            else
            {
                System.out.println("Not a double");
            }
        }

        else
        {
            System.out.println("Not an int");
        }

    }
}
