public class WordAnalyzerTester3
{
   public static void main(String[] args)
   {
      test("mississippiii", 4); // expect: 4 (ss, ss, pp, iii)
      test("test", 0); // expect: 0 (no repeated letters)
      test("aabbcdaaaabb", 4); // expect: 4 (aa, bb, aaaa, bb)
   }

   public static void test(String s, int expected)
   {
      WordAnalyzer wa = new WordAnalyzer(s);
      int result = wa.countRepeatedCharacters();
      System.out.println(result + " repeated characters.");
      System.out.println("Expected: " + expected);
   }
}