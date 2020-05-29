
import java.util.ArrayList;

/**
 * Models a RectangleProject.
 * @author Rohan Athalye
 */
public class RectangleProject
{
    private ArrayList<Rectangle> rectangles;

    public RectangleProject()
    {
        rectangles = new ArrayList<Rectangle>();
    }

    public void add(Rectangle r)
    {
        rectangles.add(r);
    }

    public Rectangle smallestWidth()
    {
        if (rectangles.size() == 0)
        {
            return null;
        }

        else
        {
            Rectangle minimum = rectangles.get(0);
            int minimumWidth = rectangles.get(0).getWidth();

            for (Rectangle element : rectangles)
            {
                if (element.getWidth() < minimumWidth)
                {
                    minimumWidth = element.getWidth();
                    minimum = element;
                }
            }

            return minimum;
        }
    }
}
