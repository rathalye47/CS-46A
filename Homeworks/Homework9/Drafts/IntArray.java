
/**
 * Processes integer arrays.
 * @author Rohan Athalye
 */
public class IntArray
{
    private int[] integers;

    /**
     * Constructs an Int Array.
     * @param integersObjects an int array.
     */
    public IntArray(int[] integersObjects)
    {
        integers = integersObjects;
    }

    /**
     * Gets the smallest integer in the array.
     * @return the smallest integer in the array.
     */
    public int smallest()
    {
        if (integers.length == 0)
        {
            return Integer.MIN_VALUE;
        }

        else
        {
            int minimum = integers[0];

            for (int i = 1; i < integers.length; i++)
            {
                if (integers[i] < minimum)
                {
                    minimum = integers[i];
                }
            }

            return minimum;
        }
    }
}
