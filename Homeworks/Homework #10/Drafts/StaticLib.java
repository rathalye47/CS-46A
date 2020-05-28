
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
}
