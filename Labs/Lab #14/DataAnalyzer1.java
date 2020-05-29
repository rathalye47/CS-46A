import java.util.Scanner;

/**
This program computes the average and maximum of a set
of input values.
 */
public class DataAnalyzer1
{  
    public static void main(String[] args)
    {  
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();
        DataSet data2 = new DataSet();

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
                data.add(x);
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

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
                double y = Double.parseDouble(input1);
                data2.add(y);
            }
        }
        
        System.out.println("Average = " + data2.getAverage());
        System.out.println("Maximum = " + data2.getMaximum());
    }
}