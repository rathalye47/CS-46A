
/**
 * Models a WeatherChart.
 * @author Rohan Athalye
 */
public class WeatherChart
{
    public static final double ABSOLUTE_ZERO = -273.15;
    private double[][] temperatures;

    public WeatherChart(double[][] theTemperatures)
    {
        temperatures = theTemperatures;
    }

    public double getLowestForMonth(int columnIndex)
    {
        if (columnIndex >= 0 && columnIndex < temperatures[0].length)
        {
            double lowest = temperatures[0][columnIndex];

            for (int rows = 0; rows < temperatures.length; rows++)
            {
                if (temperatures[rows][columnIndex] < lowest)
                {
                    lowest = temperatures[rows][columnIndex];
                }
            }

            return lowest;
        }
        
        return ABSOLUTE_ZERO;
    }
    
    public int mildCount()
    {
        int mildCount = 0;
        
        for (int row = 0; row < temperatures.length; row++)
        {
            for (int column = 0; column < temperatures[0].length; column++)
            {
                if (temperatures[row][column] >= 18.5 && temperatures[row][column] <= 28.2)
                {
                    mildCount = mildCount + 1;
                }
            }
        }
        
        return mildCount;
    }
}
