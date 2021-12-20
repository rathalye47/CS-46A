
/**
 * Draws 10 concentric circles.
 * @author Rohan Athalye
 */
public class CircleViewer
{
    public static void main(String[] args)
    {
        int x = 200 - 10;
        int y = 250 - 10;
        int radius = 10;
        
        for (int i = 1; i <= 10; i++)
        {
            Ellipse circle = new Ellipse(x, y, radius * 2, radius * 2);
            circle.draw();
            x = x - 10;
            y = y - 10;
            radius = radius + 10;
        }

    }
}
