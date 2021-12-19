
import java.util.Random;

/**
 * Models a SquareGalore
 * @author Rohan Athalye
 */
public class SquaresGalore
{
    public static void main(String[] args)
    {
        final int MAX_X = 300;
        final int MAX_Y = 500;
        final int MIN_X = 0;
        final int MIN_Y = 100;
        final int NUMBER_OF_SQUARES = 20;
        final int SIDE = 25;

        Random gen = new Random(34682489);

        for (int i = 1; i <= NUMBER_OF_SQUARES; i++)
        {
            int x = gen.nextInt(MAX_X);
            int y = MIN_Y + gen.nextInt(400);

            Rectangle square = new Rectangle(x, y, SIDE, SIDE);
            square.setColor(Color.RED);
            square.fill();
        }

    }
}
