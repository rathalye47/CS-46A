
/**
 * Models an IntegerProcessor.
 *
 * @author Rohan Athalye
 * 
 */
public class IntegerProcessor
{
    private int integer;

    /**
     * Constructs an Integer Processor with the given integer.
     * @param integer the integer of the IntegerProcessor.
     */
    public IntegerProcessor(int integer)
    {
        this.integer = integer;
        this.setInteger(integer);
    }

    /**
     * Gets the integer for this IntegerProcessor.
     * @return the integer for this IntegerProcessor.
     */
    public int getInteger()
    {
        return this.integer;
    }

    /**
     * Sets a new integer for this IntegerProcessor.
     * @param value the new integer for this IntegerProcessor.
     */
    public void setInteger(int value)
    {
        if (value < 0)
        {
            value = value * -1;
        }

        this.integer = value;
    }

    /**
     * Determines if the number qualifies as "big".
     * @return true if the number is greater than 500,000 and false otherwise.
     */
    public boolean isBig()
    {
        if (this.integer > 500000)
        {
            return true;
        }

        else
        {
            return false;
        }

    }
    
    /**
     * Determines if the number qualifies as "small".
     * @return true if the number is smaller than 100 and false otherwise.
     */
    public boolean isSmall()
    {
        if (this.integer < 100)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    /**
     * Gets a string representing the integer in the comma format.
     * @return the string representing the integer in comma format.
     */
    public String formatWithCommas()
    {
        if (this.integer < 1000000)
        {
            String stringVersion = String.format("%,d", this.integer);
            return stringVersion;
        }
        
        else
        {
            String errorMessage = "too big";
            return errorMessage;
        }
    }

}
