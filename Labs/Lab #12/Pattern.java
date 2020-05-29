import java.awt.*;
import javax.swing.*;

public class Pattern extends JComponent
{
    public static final int ROWS = 15;
    public static final int COLUMNS = 10;
    public static int GRID_SIZE = 20;

    private Color[][] colors; 

    public Pattern()
    {
        colors = new Color[ROWS][COLUMNS];
        makePattern();
    }

    public void makePattern()
    {
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                if (i % 2 == 0 && j % 3 == 0)
                {
                    colors[i][j] = Color.YELLOW;
                }

                else if (i + 4 > 7)
                {
                    colors[i][j] = Color.GREEN;
                }

                else
                {
                    colors[i][j] = Color.ORANGE;
                }
            }
        }

    }

    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
            {
                g2.setColor(colors[i][j]);
                g2.fill(new Rectangle(
                        j * GRID_SIZE,
                        i * GRID_SIZE, 
                        GRID_SIZE - 1, 
                        GRID_SIZE - 1));
            }
    }

    public Dimension getPreferredSize() 
    {
        return new Dimension(GRID_SIZE * COLUMNS,
            GRID_SIZE * ROWS);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new Pattern());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}