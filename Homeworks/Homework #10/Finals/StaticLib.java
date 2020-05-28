
import java.util.ArrayList;

/**
 * Static methods to work with Arrays and ArrayLists.
 * @author Rohan Athalye
 */
public class StaticLib
{
    /**
     * Gets the maximum value in the array.
     * @param numbers an array of numbers.
     * @return the maximum value in the array.
     */
    public static double max(double[] numbers)
    {
        if (numbers.length == 0)
        {
            return Double.NEGATIVE_INFINITY;
        }

        else
        {
            double maximum = numbers[0];

            for (double element : numbers)
            {
                if (element > maximum)
                {
                    maximum = element;
                }
            }

            return maximum;
        }
    }

    /**
     * Gets the maximum value in the ArrayList.
     * @param numbers an ArrayList of numbers.
     * @return the maximum value in the ArrayList.
     */
    public static double max(ArrayList<Double> numbers)
    {
        if (numbers.size() == 0)
        {
            return Double.NEGATIVE_INFINITY;
        }

        else
        {
            double maximum = numbers.get(0);

            for (double element : numbers)
            {
                if (element > maximum)
                {
                    maximum = element;
                }
            }

            return maximum;
        }
    }

    /**
     * Determines how many times the target is in the array.
     * @param list an array of strings.
     * @param target the string that we are looking for.
     * @return how many times the target is in the array.
     */
    public static int getCount(String[] list, String target)
    {
        int count = 0;

        for (int i = 0; i < list.length; i++)
        {
            if (list[i].equals(target))
            {
                count = count + 1;
            }
        }

        return count;
    }

    /**
     * Determines how many times the target is in the ArrayList.
     * @param list an ArrayList of strings.
     * @target the string that we are looking for.
     * @return how many times the target is in the ArrayList
     */
    public static int getCount(ArrayList<String> list, String target)
    {
        int count = 0;

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(target))
            {
                count = count + 1;
            }
        }

        return count;
    }
}
