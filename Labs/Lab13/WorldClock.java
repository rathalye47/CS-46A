
/**
 * Write a description of class WorldClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldClock extends ColoredClock
{
    private String label;
    private int offset;

    public WorldClock(String theLabel, int theOffset)
    {
        label = theLabel;
        offset = theOffset;
    }

    public void update()
    {
        if (offset > 0)
        {
            super.update();
            int worldHours = (getHours() - offset + 12) % 24;

            if (getHours() - offset + 12 <= 12)
            {
                worldHours = worldHours + offset / 2;

            }

            else
            {
                worldHours = worldHours + (offset / 2) - 12;
            }

            setHours(worldHours);
        }

        else if (offset <= 0)
        {
            super.update();
            int worldHours1 = (getHours() + 12) % 24;

            if (worldHours1 + offset > 12)
            {
                worldHours1 = worldHours1 + offset - 12;
            }

            else
            {
                worldHours1 = worldHours1 + offset;
            }

            setHours(worldHours1);
        }
    }

    public void draw()
    {
        Rectangle bounds = getBounds();
        double x = bounds.getX();
        double y = bounds.getY();
        Text text = new Text(x, y + RADIUS * 2, label);
        text.draw();
        super.draw();
    }

}
