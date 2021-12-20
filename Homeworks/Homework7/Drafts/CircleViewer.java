
/**
 * Draws 10 concentric circles.
 * @author Rohan Athalye
 */
public class CircleViewer
{
    public static void main(String[] args)
    {
        int radius = 10;
        
        for (int i = 1; i <= 1; i++)
        {
            Ellipse innerMostCircle = new Ellipse(200 - 10, 250 - 10, radius * 2, radius * 2);
            innerMostCircle.draw();
        }

    }
}
