
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
     * @param theDiameter the diameter of this Object.
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
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                Ellipse circle = new Ellipse(xStart + (diameter * j), yStart + (diameter * i), diameter, diameter);
                circle.setColor(getRandomColor());
                circle.fill();
            }

            System.out.println();
        }
    }

    /**
     * Gets a random color 
     * @return a random color Color.RED, Color.GREEN, Color.BLUE or Color.BLACK
     */
    public Color getRandomColor()
    {
        int numRandomColor = gen.nextInt(NUMBER_OF_COLORS);
        Color randomColor;

        if (numRandomColor == RED)
        {
            randomColor = Color.RED; 
        }

        else if (numRandomColor == BLUE)
        {
            randomColor = Color.BLUE;
        }

        else if (numRandomColor == BLACK)
        {
            randomColor = Color.BLACK;
        }

        else
        {
            randomColor = Color.GREEN;
        }

        return randomColor;
    }
}
