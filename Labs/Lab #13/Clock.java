import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock
{
    private int x;
    private int y;
    private int hours;
    private int minutes;
    private int seconds;

    public static final int RADIUS = 45;

    public Clock()
    {
        x = 0;
        y = 0;
        update();
    }

    public void update()
    {
        GregorianCalendar cal = new GregorianCalendar();
        hours = cal.get(Calendar.HOUR_OF_DAY);
        minutes = cal.get(Calendar.MINUTE);
        seconds = cal.get(Calendar.SECOND);
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public void moveTo(int newX, int newY)
    {
        x = newX;
        y = newY;
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x, y, 2 * RADIUS, 2 * RADIUS);
    }

    public void draw()
    {
        update();

        final double MIN_HAND_LENGTH = 90 * RADIUS / 100;
        final double HOUR_HAND_LENGTH = 70 * RADIUS / 100;

        Ellipse circle = new Ellipse(x, y, 2 * RADIUS, 2 * RADIUS);
        circle.draw();

        final double MINUTES_PER_HOUR = 60;
        final double MINUTES_PER_360 = 60 * 12;

        double minAngle = Math.PI / 2 - 2 * Math.PI * minutes / MINUTES_PER_HOUR;

        // draw the minutes hand

        Line minHand = new Line(x + RADIUS, y + RADIUS,
                x + RADIUS + MIN_HAND_LENGTH * Math.cos(minAngle),
                y + RADIUS - MIN_HAND_LENGTH * Math.sin(minAngle));

        double hourAngle = Math.PI / 2 - 2 * Math.PI * (hours * MINUTES_PER_HOUR + minutes) / MINUTES_PER_360;

        // draw the hours hand

        Line hourHand = new Line(x + RADIUS, y + RADIUS,
                x + RADIUS + HOUR_HAND_LENGTH * Math.cos(hourAngle),
                y + RADIUS - HOUR_HAND_LENGTH * Math.sin(hourAngle));

        minHand.draw();
        hourHand.draw();
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return "Clock[hours=" + hours + ",minutes=" + minutes +
        ",seconds=" + seconds + ",x=" + x + ",y=" + y + "]";
    }
}
