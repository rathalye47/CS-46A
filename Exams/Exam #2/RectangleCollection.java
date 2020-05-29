
/**
 * Models a RectangleCollection
 * @author Rohan Athalye
 */
public class RectangleCollection
{
    private Rectangle[] rectangles;

    public RectangleCollection(Rectangle[] theRectangles)
    {
        rectangles = theRectangles;
    }

    public int totalPerimeters()
    {
        int total = 0;

        for (Rectangle element : rectangles)
        {
            int perimeter = 2 * element.getWidth() + 2 * element.getHeight();
            total = total + perimeter;
        }

        return total;
    }

}
