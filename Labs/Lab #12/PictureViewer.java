public class PictureViewer
{
    public static void main(String[] args)
    {
        Picture blimp = new Picture("blimp.jpg");
        int[][] grayscale = blimp.getGrayLevels();
        
        for (int i = 0; i < blimp.getHeight(); i++)
        {
            for (int j = 0; j < blimp.getWidth(); j++)
            {
                grayscale[i][j] = 255 - grayscale[i][j];
            }
        }
       
        Picture grayBlimp = new Picture(grayscale);
        grayBlimp.draw();  
    }
}