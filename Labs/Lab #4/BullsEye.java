public class BullsEye
{
   private int x;
   private int y;
   private int d;

   /**
    * Constructs a bulls eye with a given center.
    * @param centerX the x coordinate of the center
    * @param centerY the y coordinate of the center
    */
   public BullsEye(int centerX, int centerY)
   {
       x = centerX;
       y = centerY;
       d = 90;
       
   }
   
   /**
    * Draws the bulls eye
    */
   public void draw()
   {              
      /**
      int d = 90;
      Ellipse biggestCircle = new Ellipse(x - d / 2, y - d / 2, d, d);
      biggestCircle.setColor(Color.BLUE);
      biggestCircle.fill();
      
      int dTwo = 60;
      Ellipse middleCircle = new Ellipse(x - dTwo / 2, y - dTwo / 2, dTwo, dTwo);
      middleCircle.setColor(Color.WHITE);
      middleCircle.fill();
      
      int dThree = 30;
      Ellipse smallCircle = new Ellipse(x - dThree / 2, y - dThree / 2, dThree, dThree);
      smallCircle.setColor(Color.RED);
      smallCircle.fill();
      */
     
      //int d = 90;
      Ellipse biggestCircle = new Ellipse(x - d / 2, y - d / 2, d, d);
      biggestCircle.setColor(Color.BLUE);
      biggestCircle.fill();
      
      int dTwo = d * 2/3;
      Ellipse middleCircle = new Ellipse(x - dTwo / 2, y - dTwo / 2, dTwo, dTwo);
      middleCircle.setColor(Color.WHITE);
      middleCircle.fill();
      
      int dThree = d * 1/3;
      Ellipse smallCircle = new Ellipse(x - dThree / 2, y - dThree / 2, dThree, dThree);
      smallCircle.setColor(Color.RED);
      smallCircle.fill();
      
   }
   
   /**
   * Increase the diameter of the BullsEye
   * @param growAmount the amount to increase the diameter of the largest circle by
   */
   public void grow(int growAmount)
   {
       d = d + growAmount;
   }
}     