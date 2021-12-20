
/**
 * Write a description of class RandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWalk
{
    public static void main(String[] args)
    {
        Picture vacuum = new Picture("large_roomba.png");
        vacuum.translate(200,200);
        vacuum.draw();
        double distance = 5;

        for (int i = 1; i <= 3000; i++)
        {
            double angle = Math.toRadians(Math.random() * 360);
            double dx = distance * Math.cos(angle);
            double dy = distance * Math.sin(angle);  
            vacuum.translate(dx,dy);
            
            Ellipse circle = new Ellipse((vacuum.getWidth() / 2 + vacuum.getX()), (vacuum.getHeight() / 2) + vacuum.getY(), 10, 10);
            circle.fill();
        }
    }
}
