
/**
 * Draws the flag of Chad.
 * @author Rohan Athalye
 */
public class ChadFlag
{
    private int width;
    private int height;
    private Picture image;

    /**
     * Constructs the flag of Chad with the given width and height.
     * @param theWidth the width of the flag of Chad.
     * @param theHeight the height of the flag of Chad.
     */
    public ChadFlag(int theWidth, int theHeight)
    {
        width = theWidth;
        height = theHeight;
        image = new Picture(width, height);
        image.draw();

        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color flagColor = getColor(x, y);
                image.setColorAt(x, y, flagColor);
            }
        }
    }

    /**
     * Gets the color of the specified pixel.
     * @param x the x-coordinate of the flag of Chad.
     * @param y the y-coordinate of the flag of Chad.
     */
    public Color getColor(int xCoordinate, int yCoordinate)
    {
        Color theFlagColor;

        if (xCoordinate < (width / 3))
        {
            theFlagColor = new Color(00, 00, 205);
        }

        else
        {
            theFlagColor = Color.BLACK;
        }

        return theFlagColor;
    }
}
