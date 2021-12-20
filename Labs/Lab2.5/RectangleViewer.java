public class RectangleViewer
{
   public static void main(String[] args)
   {
       Rectangle r1 = new Rectangle(5, 10, 20, 30);
       r1.draw();
       Rectangle r2 = new Rectangle (30, 10, 20, 30);
       r2.draw();
       r1.translate(100, 50);
       r1.grow(50, 25);
   }
}
