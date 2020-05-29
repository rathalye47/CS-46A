
/**
 * Models a ReliefMap.
 * @author Rohan Athalye
 */
public class ReliefMap
{
    private int[][] points;

    public ReliefMap(int[][] array)
    {
        points = array;
    }

    public int highest()
    {
        int maximum = points[0][0];

        for (int i = 0; i < points.length; i++)
        {
            for (int j = 0; j < points[0].length; j++)
            {
                if (points[i][j] > maximum)
                {
                    maximum = points[i][j];
                }
            }
        }

        return maximum;
    }
    
    public int aboveSeaLevelCountInRow(int row)
    {
        int count = 0;
        
        for (int column = 0; column < points[0].length; column++)
        {
            if (points[row][column] > 0)
            {
                count = count + 1;
            }
        }
        
        return count;
    }
}
