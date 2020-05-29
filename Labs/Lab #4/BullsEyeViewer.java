public class BullsEyeViewer
{
   public static void main(String[] args)
   {
      //Ellipse circle3 = new Ellipse(5, 20, 90, 90);
      //circle3.setColor(Color.BLUE);
      //circle3.fill();
       
      //Ellipse circle2 = new Ellipse(20, 35, 60, 60);
      //circle2.setColor(Color.WHITE); 
      //circle2.fill();
       
      //Ellipse circle1 = new Ellipse(35, 50, 30, 30);
      //circle1.setColor(Color.RED);
      //circle1.fill();
      
      //BullsEye eye1 = new BullsEye(100, 100);
      //eye1.draw();
      //BullsEye eye2 = new BullsEye(200, 200);
      //eye2.draw();
      //BullsEye eye3 = new BullsEye(50, 300);
      //eye3.draw();
      
      BullsEye eye1 = new BullsEye(100, 100);
      eye1.draw();
      BullsEye eye2 = new BullsEye(200, 200);
      eye2.grow(60);
      eye2.draw();
      BullsEye eye3 = new BullsEye(50, 300);
      eye3.grow(-30);
      eye3.draw();
        
   }
}