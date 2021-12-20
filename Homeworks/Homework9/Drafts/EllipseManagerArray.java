
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

    @Override
    public String toString()
    {
        return Arrays.toString(ellipses);
    }
}
