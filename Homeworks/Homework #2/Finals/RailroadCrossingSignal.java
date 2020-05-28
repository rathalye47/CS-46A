/**
 * Draws a simulation of a railroad crossing signal
 * @author Rohan Athalye
 */

public class RailroadCrossingSignal
{
    public static void main(String[] args)
    {
        Ellipse leftCircle = new Ellipse(50, 30, 40, 40);
        leftCircle.setColor(Color.RED);
        leftCircle.fill();
        
        Ellipse rightCircle = new Ellipse(110, 30, 40, 40);
        rightCircle.fill();
        
        Rectangle blackRectangle = new Rectangle(70, 30, 60, 2);
        blackRectangle.fill();
    }
}