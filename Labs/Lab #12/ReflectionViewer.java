
/**
 * Models a ReflectionViewer
 * @author Rohan Athalye
 */
public class ReflectionViewer
{
    public static void main(String[] args)
    {
        Picture blimp = new Picture("blimp.jpg");
        int[][] grayscale = blimp.getGrayLevels();
        int count = 0;
        Picture grayBlimp = new Picture(grayscale);
        grayBlimp.draw();  
        
         for (int i = 0; i < blimp.getHeight(); i++)
        {
            for (int j = 0; j < blimp.getWidth() / 2; j++)
            {
                int temp = grayscale[i][j];
                grayscale[i][j] = grayscale[i][blimp.getHeight() - j];
                //grayscale[i][blimp.getHeight() - j] = temp;
            }
        }
        
        Picture grayBlimp1 = new Picture(grayscale);
        grayBlimp1.draw();
    }
}
