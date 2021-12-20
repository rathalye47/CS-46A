public class TextTester2
{
   public static void main(String[] args)
   {
      Text text2 = new Text();
      text2.load("mary.txt");
      text2.removeAllDuplicates();
      System.out.println("Actual:   " + text2.getWords());
      System.out.println("Expected: [Mary, had, a, little, lamb, whose, fleece, was, white, as, snow, And, everywhere, that, went, and, the, sure, to, go]");

      text2.load("test.txt");
      text2.removeAllDuplicates();
      System.out.println("Actual:   " + text2.getWords());
      System.out.println("Expected: [a, b, c, d]");

      text2.load("alice30.txt");
      int before = text2.getWords().size();
      text2.removeAllDuplicates();
      int after = text2.getWords().size();
      System.out.println("Size before and after: " + before + " " + after);
      System.out.println("Expected: 29074 3385");      
   }
}
