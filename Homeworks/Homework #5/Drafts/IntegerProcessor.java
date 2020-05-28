
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
   
}
