
/**
 * Models a FlashingCautionSignalViewer.
 *
 * @author Rohan Athalye
 * 
 */
public class FlashingCautionSignalViewer
{
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle(25, 50, 130, 30);
        rectangle1.fill();

        Ellipse circle1 = new Ellipse(35, 50, 30, 30);
        circle1.setColor(Color.YELLOW);
        circle1.fill();

        Ellipse circle2 = new Ellipse(75, 50, 30, 30);
        Color color1 = new Color(197, 179, 88);
        circle2.setColor(color1);
        circle2.fill();

        Ellipse circle3 = new Ellipse(115, 50, 30, 30);
        Color color2 = new Color(197, 179, 88);
        circle3.setColor(color2);
        circle3.fill();

    }
}
