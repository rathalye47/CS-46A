public class NumbersTester
{
   public static void main(String[] args)
   {
      int[] a = { 1, 2, 3 };
      int[] r = Numbers.evenOdds(a);
      System.out.println(r[0] + " " + r[1]);
      System.out.println("Expected: 1 2");
      a[1] = 5;
      r = Numbers.evenOdds(a);
      System.out.println(r[0] + " " + r[1]);
      System.out.println("Expected: 0 3");
      a = new int[0];
      r = Numbers.evenOdds(a);
      System.out.println(r[0] + " " + r[1]);
      System.out.println("Expected: 0 0");
   }
}
