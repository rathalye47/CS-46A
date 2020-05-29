import java.util.Scanner;

/**
This program computes the average and maximum of a set
of input values.
 */
public class DataAnalyzer3
{  
    private static double sum;
    private static double count;
    private static double maximum;

    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        sum = 0;
        count = 0;
        maximum = 0;
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
                add(x);
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
    }

    /**
    Adds a data value to the data set
    @param x a data value
     */
    public static void add(double x)
    {
        sum = sum + x;

        if (count == 0 || maximum < x)
        {
            maximum = x;
        }

        count++;
    }

    /**
    Gets the average of the added data.
    @return the average or 0 if no data has been added
     */
    public static double getAverage()
    {
        if (count == 0)
        {
            return 0; 
        }
        else
        {
            return sum / count;
        }
    }
}