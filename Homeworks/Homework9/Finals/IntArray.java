
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

    /**
     * Gets a string containing all the negative numbers in the array separated by a comma (,).
     * @return a string containing all the negative numbers in the array separated by a comma (,).
     */
    public String negatives()
    {
        String stringNegatives = "";
        int count = 0;

        for (int i = 0; i < integers.length; i++)
        {
            if (integers[i] < 0)
            {
                count = count + 1;

                if (count > 1)
                {
                    stringNegatives = stringNegatives + ", " + integers[i];
                }

                else
                {
                    stringNegatives = stringNegatives + integers[i];
                }
            }
        }

        return stringNegatives;
    }

    /**
     * Gets the number of integers less than or equal to 0.
     * @return the number of integers less than or equal to 0.
     */
    public int negativeCount()
    {
        int numNegatives = 0;

        for (int i = 0; i < integers.length; i++)
        {
            if (integers[i] <= 0)
            {
                numNegatives = numNegatives + 1;
            }
        }

        return numNegatives;
    }
}
