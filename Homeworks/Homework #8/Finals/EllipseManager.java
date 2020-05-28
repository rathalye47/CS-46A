
import java.util.ArrayList;

/**
 * Manages a collection of Ellipse objects
 * @author Rohan Athalye
 */
public class EllipseManager
{
    private ArrayList<Ellipse> list;

    /**
     * Constructs an EllipseManager.
     */
    public EllipseManager()
    {
        list = new ArrayList<Ellipse>();
    }

    /**
     * Adds this Ellipse to the EllipseManager.
     * @param e the ellipse to be added to the EllipseManager(the ArrayList instance variable).
     */
    public void add(Ellipse e)
    {
        list.add(e);
    }

    /**
     * Swaps the element at index1 with the element at index2. 
     * @param index1 the position of the first element.
     * @param index2 the position of the second element.
     */
    public void exchange(int index1, int index2)
    {
        if ((index1 >= 0 && index2 >= 0) && (index1 < list.size() && index2 < list.size()))
        {
            Ellipse temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }
    }

    /**
     * Gets the Ellipse with the largest area.
     * @return the Ellipse with the largest area.
     */
    public Ellipse largest()
    {
        if (list.size() == 0)
        {
            return null;
        }

        else
        {
            Ellipse maximum = list.get(0);
            double maximumArea = Math.PI * list.get(0).getWidth() / 2 + list.get(0).getHeight() / 2;

            for (Ellipse ellipse : list)
            {
                double area = Math.PI * ellipse.getWidth() / 2 + ellipse.getHeight() / 2;

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
        return list.toString();
    }
}