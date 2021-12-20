
/**
 * Models a Powerwall
 *
 * @author Rohan Athalye
 * 
 */
public class Powerwall
{
    
    private int maxCapacity;
    private int currentCharge;

    /**
     * Constructs a new Powerwall with the given capacity.
     * @param capacity of this Powerwall.
     */
    public Powerwall(int capacity)
    {
        maxCapacity = capacity;
    }

    /**
     * Gets the maximum capacity of this Powerwall.
     * @return the maximum capacity of this Powerwall.
     */
    public int getMaxCapacity()
    {
        return maxCapacity;
    }
    
    /**
     * Gets the number of kwh in this Powerwall.
     * @return the number of kwh in this Powerwall.
     */
    public int getCurrentCharge()
    {
        return 0;
    }
    
    /**
     * Simulates using the specified number of kwh.
     * @param amountToUse the amount to use for this Powerwall.
     */
    public void use(int amountToUse)
    {
        
    }
    
    /**
     * Simulates adding the given amount of electricity to the Powerwall.
     * @param amountToAdd the amount to add to this Powerwall.
     */
    public void charge(int amountToAdd) 
    {
        
    }
     
}
