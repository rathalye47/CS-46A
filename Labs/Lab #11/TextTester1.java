public class TextTester1
{
    public static void main(String[] args)
    {
        Text text1 = new Text();
        text1.load("typo.txt");
        text1.removeAdjacentDuplicates();
        System.out.println("Actual:   " + text1.getWords());
        System.out.println("Expected: [A, common, typo, is, to, accidentally, duplicate, a, word, which, can, be, rather, embarrassing]");

        text1.load("test.txt");
        text1.removeAdjacentDuplicates();
        System.out.println("Actual:   " + text1.getWords());
        System.out.println("Expected: [a, b, a, c, a, d, a]");

        text1.load("alice30.txt");
        int before = text1.getWords().size();
        text1.removeAdjacentDuplicates();
        int after = text1.getWords().size();
        System.out.println("Size before and after: " + before + " " + after);
        System.out.println("Expected: 29074 29045");      
    }
}