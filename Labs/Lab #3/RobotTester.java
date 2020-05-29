
/**
 * Tests the Robot Class.
 *
 * @Rohan Athalye
 */
public class RobotTester
{
    public static void main(String[] args)
    {
        Picture pic = new Picture("myrobot.jpeg");
        Robot robot = new Robot(0, 0);
        robot.moveHorizontally(5);
        robot.moveHorizontally(-3);
        System.out.println(robot.getX());
        System.out.println("Expected: 2"); 
        robot.moveVertically(6);
        robot.moveVertically(-4);
        System.out.println(robot.getY());
        System.out.println("Expected: 2"); 
        robot.moveRight();
        
        
    }
}
