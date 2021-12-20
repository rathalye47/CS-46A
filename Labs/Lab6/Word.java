public class Word
{
    /**
    Tests whether a letter is a vowel
    @param letter a string of length 1
    @return true if letter is a vowel
     */
    public boolean isVowel(String letter)
    {

        String letterLower = letter.toLowerCase();
        /**
        if (letterLower.equals("a") || letterLower.equals("e") || letterLower.equals("i") || letterLower.equals("o") || letterLower.equals("u") || letterLower.equals("y"))
        {
        return true;
        }

        else
        {
        return false;
        }
         */

        String vowels = "aeiouy";

        if (vowels.contains(letterLower))
        {
            return true;
        }

        else
        {
            return false;
        }

    }
}
