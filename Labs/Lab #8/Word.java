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

            if (("aeiouy").contains(letter))
            {
                counter = counter + 1; 
            }

            i = i + 1;

        }
        
        return counter;
    }

    public int countVowelGroups()
    {
        int numVowelGroup = 0;

        for (int i = 0; i < text.length(); i++)
        {
            String letter1 = text.substring(i, i + 1);

            if (("aeiouy").contains(letter1))
            {
                if (i != 0 && !"aeiouy".contains(text.substring(i - 1, i)))
                {
                    numVowelGroup = numVowelGroup + 1;
                }

                else if (i != 0 && "aeiouy".contains(text.substring(i - 1, i)))
                {
                    numVowelGroup = numVowelGroup;
                }
                
                else if (i == 0)
                {
                    numVowelGroup = numVowelGroup + 1;
                }
                
            }
        }
        
        return numVowelGroup;

        /**
        boolean first = false;

        for (int i = 0; i < text.length(); i++)
        {
            String letter = text.substring(i, i + 1);

            if (isVowel(letter))
            {
                if (first == false)
                {
                    first = true;
                    numVowelGroup++;
                }
            }

            else
            {
                first = false;
            }
        }

        return numVowelGroup;
        */
    }
    
    public int countVowelGroups2()
    {
        int count = 0;
        int last = text.length() - 1;
        
        if (last < 0)
        {
            return 0;
        }
        
        if (text.endsWith("e"))
        {
            last = last - 1;
        }
        
        boolean inVowelGroup = false;
        
        for (int i = 0; i <= last; i++)
        {
            String letter = text.substring(i, i + 1);
            
            if ("aeiouy".contains(letter))
            {
                if (!inVowelGroup)
                {
                    count = count + 1;
                    inVowelGroup = true;
                }
            }
            
            else
            {
                inVowelGroup = false;
            }
        }
        
        return count;
    }

    public String toString()
    {
        return text;
    }
}