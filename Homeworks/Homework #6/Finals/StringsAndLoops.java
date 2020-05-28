
/**
 * Experiments with StringsAndLoops.
 * I received some help from Piazza Post @621 to come up with the while loop condition "while (spaceIndex > -1)" in the firsts() method.
 * Rohan Athalye
 */
public class StringsAndLoops
{
    private String text;

    /**
     * Constructs a String of text with the given text.
     * @param theText the String of text.
     */
    public StringsAndLoops(String theText)
    {
        text = theText;
    }

    /**
     * Gets the text.
     * @return the text.
     */
    public String getText()
    {
        return text;
    }

    /**
     * Gets the number of uppercase letters in the text.
     * @return the number of uppercase letters in the text.
     */
    public int getUpperCaseCount()
    {
        int upperCaseCount = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char textCharacter = text.charAt(i);

            if (Character.isUpperCase(textCharacter))
            {
                upperCaseCount = upperCaseCount + 1;
            }
        }

        return upperCaseCount;
    }

    /**
     * Gets the number of a's in the String, either upper or lower case.
     * @return the number of a's in the String, either upper or lower case.
     */
    public int getACount()
    {
        int aCount = 0;

        for (int j = 0; j < text.length(); j++)
        {
            String letter = text.substring(j, j + 1);

            if (letter.equalsIgnoreCase("a"))
            {
                aCount = aCount + 1;
            }
        }

        return aCount;
    }

    /**
     * Gets a string consisting of the first character of every word in the string.
     * @return a string consisting of the first character of every word in the string.
     */
    public String firsts()
    {
        if (text.equals(""))
        {
            return "";
        }

        String firstLetter = text.substring(0,1);
        String firstLettersOfWords = "";
        int spaceIndex = text.indexOf(" ");

        while (spaceIndex != -1)
        {
            firstLettersOfWords = firstLettersOfWords + text.substring(spaceIndex + 1, spaceIndex + 2); 
            spaceIndex = text.indexOf(" ", spaceIndex + 1);
        }

        return firstLetter + firstLettersOfWords;
    }
}
