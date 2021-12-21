import java.util.Scanner;

/**
This program computes the average and maximum of a set
of input values.
 */
public class DataAnalyzer2
{  
    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        double maximum = 0;
        boolean done = false;

        while (!done)
        {  
            System.out.print("Enter value, Q to quit: ");
            String input = in.next(); 

            if (input.equalsIgnoreCase("Q"))
            {
                done = true;
            }

            else
            {  
                double x = Double.parseDouble(input);
                sum = sum + x;

                if (count == 0 || maximum < x)
                {
                    maximum = x;
                }

                count++;
            }
        }

        double average;

        if (count == 0)
        {
            average = 0;
        }
        else
        {
            average = sum / count;
        }

        System.out.println("Average = " + average);
        System.out.println("Maximum = " + maximum);

        double sum1 = 0;
        double count1 = 0;
        double maximum1 = 0;
        boolean done1 = false;

        while (!done1)
        {  
            System.out.print("Enter value, Q to quit: ");
            String input1 = in.next(); 

            if (input1.equalsIgnoreCase("Q"))
            {
                done1 = true;
            }

            else
            {  
                double x1 = Double.parseDouble(input1);
                sum1 = sum1 + x1;

                if (count1 == 0 || maximum1 < x1)
                {
                    maximum1 = x1;
                }

                count1++;
            }
        }

        double average1;

        if (count1 == 0)
        {
            average1 = 0;
        }
        else
        {
            average1 = sum1 / count1;
        }

        System.out.println("Average = " + average1);
        System.out.println("Maximum = " + maximum1);
    }
}
