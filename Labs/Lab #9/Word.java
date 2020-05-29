public class Word
{
    private String text;

    /**
    Constructs a word.
    @param text the characters in this word
     */
    public Word(String text)
    {
        this.text = text;
    }

    /**
    Tests whether a letter is a vowel
    @param letter a string of length 1
    @return true if letter is a vowel
     */
    public boolean isVowel(String letter)
    {
        return "aeiouy".contains(letter.toLowerCase());
    }

    public int countVowels()
    {
        int i = 0;
        int counter = 0;
        while (i < text.length())
        {
            String letter = text.substring(i, i + 1); // the ith letter
            // Your work here

        }
        return 0;
    }

    public String getVowels()
    {
        String result = "";

        for (int i = 0; i < text.length(); i++) 
        {
            String ch = text.substring(i, i + 1); 

            if (isVowel(ch))
            {
                result = result + ch;
            }
        }

        return result;
    }

    public String getVowelsFirst()
    {

        /**
        String result1 = "";
        String result2 = "";

        for (int i = 0; i < text.length(); i++) 
        {
        String ch1 = text.substring(i, i + 1); 

        if (isVowel(ch1))
        {
        result1 = result1 + ch1;
        }

        else
        {
        result2 = result2 + ch1;
        }
        }

        return result1 + result2;
         */

        String result3 = getVowels();

        for (int i = 0; i < text.length(); i++) 
        {
            String ch2 = text.substring(i, i + 1); 

            if (!isVowel(ch2))
            {
                result3 = result3 + ch2;
            }
        }

        return result3;

        //return "";
    }

    public String longestVowelGroupSoFar()
    {
        String longestVowelGroup = "";
        String longestVowelGroupSoFar = "";
        int i = 0;
        
        while (i < text.length())
        {
            String letter = text.substring(i, i + 1);
            i++;
            
            if (isVowel(letter))
            {
                longestVowelGroupSoFar += letter;

                while (i < text.length() && isVowel(text.substring(i, i + 1)))
                {
                    longestVowelGroupSoFar += text.substring(i, i + 1);
                    i++;
                }
            }

            if (longestVowelGroupSoFar.length() > longestVowelGroup.length())
            {
                longestVowelGroup = longestVowelGroupSoFar;
            }

            longestVowelGroupSoFar = "";
        }

        return longestVowelGroup;
    }

    public int countVowelGroups()
    {
        // Your work here
        return 0;
    }

    public String toString()
    {
        return text;
    }
}