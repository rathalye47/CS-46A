
import java.util.Random;

/**
 * A class representing rows of filled circles.
 * @author Rohan Athalye
 */
public class ColoredCircles
{
    public static final int ROWS = 5;
    public static final int COLUMNS = 4;
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int BLACK = 2;
    public static final int GREEN = 3;
    public static final int NUMBER_OF_COLORS = 4;

    private int xStart;
    private int yStart;
    private int diameter;
    private Random gen;

    /**
     * Constructs a XRectangle at the given x, y
     * @param theX x coordinate of the upper hand corner of this Object
     * @param theY y the upper-left hand corner of this Object
     * @param diameter the diameter of this Object.
     */
    public ColoredCircles(int theX, int theY, int theDiameter)
    {
        xStart = theX;
        yStart = theY;
        diameter = theDiameter;

        gen = new Random(54319576);
    }

    /**
     * Draws this ColoredCircle
     */
    public void draw()
    {
        for (int i = 1; i <= 1; i++)
        {
            for (int j = 1; j <= COLUMNS; j++)
            {
                Ellipse circle = new Ellipse(xStart, yStart, diameter, diameter);
                circle.setColor(Color.RED);
                circle.fill();
                xStart = xStart + diameter;
            }
        }
    }
}
