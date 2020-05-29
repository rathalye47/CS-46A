public class WordTester2
{
   public static void main(String[] args)
   {
      Word w = new Word("beauty");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 2");
      w = new Word("mississippi");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 4");
      w = new Word("ant");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 1");
      w = new Word("treasure");
      System.out.println("Vowel groups in " + w + ": " + w.countVowelGroups());
      System.out.println("Expected: 3");    
   }
}