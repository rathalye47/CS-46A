public class Numbers
{
    /**
    Computes the number of even and odd values in a given array
    @param values an array of integer values
    @return an array of length 2 whose 0 entry contains the count
    of even elements and whose 1 entry contains the count of odd
    values
     */
    public static int[] evenOdds(int[] values)
    {
        int[] countArray = new int[2];
        int numEven = 0;

        for (int element : values)
        {
            if (element % 2 == 0)
            {
                numEven = numEven + 1;
            }
        }

        int numOdd = values.length - numEven;
        
        countArray[0] = numEven;
        countArray[1] = numOdd;

        return countArray;
    }
}
