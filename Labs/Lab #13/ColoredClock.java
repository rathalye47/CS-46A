
/**
 * Models a Colored Clock.
 * @author Rohan Athalye
 */
public class ColoredClock extends Clock
{
    public void draw()
    {

        Color color = Color.YELLOW;
        Ellipse circle = new Ellipse(getX(), getY(), 2 * RADIUS, 2 * RADIUS);
        circle.setColor(color);
        circle.fill(); 
        super.draw();

        Ellipse circle1 = new Ellipse(getX(), getY(), 2 * RADIUS, 2 * RADIUS);
        int numHours = getHours();

        if (numHours >= 6 && numHours < 18)
        {
            circle1.setColor(Color.YELLOW);
            circle1.fill(); 
            super.draw();
        }

        else
        {
            circle1.setColor(Color.BLUE);
            circle1.fill(); 
            super.draw();
        }
    }

    public void update()
    {
        super.update();
        int updatedHours = (getHours() + 12) % 24;
        setHours(updatedHours);
    }

}

