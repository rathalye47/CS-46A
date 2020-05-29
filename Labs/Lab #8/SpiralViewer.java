/**
Viewer for a spiral drawing
 */
public class SpiralViewer
{
    public static void main(String[] args)
    {

        final int GRID_SIZE = 10;
        int factor = -1;
        int growth = 1;
        int endX = 100;
        int endY = 100;
        int startX;
        int startY;

        for (int n = 0; n < 20; n++)
        {
            startX = endX;
            startY = endY;

            if (n % 2 == 0)
            {
                endY = endY + (GRID_SIZE * growth * factor);
                factor = factor * -1;
            }
            
            else
            {
                endY = endY + (GRID_SIZE * growth);
                factor = factor * -1;
            }

            Line line = new Line(startX, startY, endX, endY);
            line.draw();
            startX = endX;
            startY = endY;
            endX = endX + (GRID_SIZE * growth * -factor);
            Line line2 = new Line(startX, startY, endX, endY);
            line2.draw();
            growth++;
            
        }
    }
}