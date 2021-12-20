
/**
 * Models a Railroad Crossing Signal.
 *
 * @author Rohan Athalye
 */
public class RailroadCrossingSignal
{
    private int x;
    private int y;

    /**
     * Constructs a new railroad crossing signal with the given x-coordinate and y-coordinate.
     * @param theX x-coordinate of this railroad crossing signal.
     * @param theY y-coordinate of this railroad crossing signal.
     */
    public RailroadCrossingSignal(int theX, int theY)
    {
        x = theX;
        y = theY;
    }

    /** 
     * Creates the drawing of a railroad crossing signal.
     */
    public void draw()
    {
        Ellipse circle1 = new Ellipse(x, y, 40, 40);
        circle1.setColor(Color.RED);
        circle1.fill();

        Ellipse circle2 = new Ellipse(x + 40 + 20, y, 40, 40);
        circle2.fill();

        Rectangle blackRectangle = new Rectangle(x + 20, y, 60, 2);
        blackRectangle.fill();

    }
}
