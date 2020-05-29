
/**
 * Models a Ball.
 * @author Rohan Athalye
 */
public class Ball implements Drawable
{
    private int x;
    private int y;

    public Ball(int theX, int theY)
    {
        x = theX;
        y = theY;
    }

    public void draw()
    {
        final int DIAMETER = 40;
        Ellipse shape = new Ellipse(x, y, DIAMETER, DIAMETER);
        shape.setColor(Color.RED);
        shape.fill();
    }
}
