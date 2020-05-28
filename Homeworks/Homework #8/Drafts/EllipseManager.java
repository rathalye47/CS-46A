
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
    
    @Override
    public String toString()
    {
        return list.toString();
    }
}