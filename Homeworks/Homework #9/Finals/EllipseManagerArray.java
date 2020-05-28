
import java.util.Arrays;

/**
 * Manages a collection of Ellipse objects.
 * @author Rohan Athalye
 */
public class EllipseManagerArray
{
    private Ellipse[] ellipses;

    /**
     * Constructs an EllipseManagerArray.
     * @param ellipsesObjects an array of ellipses objects.
     */
    public EllipseManagerArray(Ellipse[] ellipsesObjects)
    {
        ellipses = ellipsesObjects;
    }

    /**
     * Gets the average area of the Ellipses.
     * @return the average area of the Ellipses.
     */
    public double average()
    {
        double total = 0;
        double area = 0;

        for (Ellipse element : ellipses)
        {
            area = Math.PI * element.getWidth() / 2.0 * element.getHeight() / 2.0;
            total = total + area;
        }

        double average = 0;

        if (ellipses.length > 0)
        {
            average = total / ellipses.length;
        }

        return average;
    }

    /**
     * Swaps the element at index1 with the element at index2.
     * @param index1 the position of an element.
     * @param index2 the position of a different element.
     */
    public void exchange(int index1, int index2)
    {
        if ((index1 >= 0 && index2 >= 0) && (index1 < ellipses.length && index2 < ellipses.length))
        {
            Ellipse temp = ellipses[index1];
            ellipses[index1] = ellipses[index2];
            ellipses[index2] = temp;
        }
    }

    /**
     * Gets the Ellipse with the largest area.
     * @return the Ellipse with the largest area.
     */
    public Ellipse largest()
    {
        if (ellipses.length == 0)
        {
            return null;
        }

        else
        {
            Ellipse maximum = ellipses[0];
            double maximumArea = Math.PI * ellipses[0].getWidth() / 2 * ellipses[0].getHeight() / 2;
            double area = 0;

            for (Ellipse ellipse : ellipses)
            {
                area = Math.PI * ellipse.getWidth() / 2 * ellipse.getHeight() / 2;

                if (area > maximumArea)
                {
                    maximumArea = area;
                    maximum = ellipse;
                }
            }

            return maximum;
        }
    }

    @Override
    public String toString()
    {
        return Arrays.toString(ellipses);
    }
}