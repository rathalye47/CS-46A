
/**
 * Experiments with StringsAndLoops.
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
}
