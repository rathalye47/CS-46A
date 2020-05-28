
/**
 * Models a Wildebeest design pattern for maintaining state.
 * @author Rohan Athalye
 */
public class Wildebeest
{
    public static final int NOT_HUNGRY = 1;
    public static final int SOMEWHAT_HUNGRY = 2;
    public static final int HUNGRY = 3;
    public static final int VERY_HUNGRY = 4;

    private int hungerState;

    /**
     * Constructs a Wildebeest design pattern for maintaining state.
     */
    public Wildebeest()
    {
        hungerState = VERY_HUNGRY;
    }

    /**
     * The Wildebeest becomes more hungry if not already VERY_HUNGRY.
     */
    public void run()
    {

    }

    /**
     * The Wildebeest will eat if it is hungry and become less hungry.
     */
    public void seeFood()
    {

    }

    /**
     * Gets the integer representing the state, an integer 1 through 4.
     * @return the integer representing the state, an integer 1 through 4.
     */
    public int getState()
    {
        return hungerState;
    }

    /**
     * Gets a string describing the current hunger state of the Wildebeest.
     * @return a string describing the current hunger state of the Wildebeest
     */
    public String getHungerLevel()
    {
        return null;
    }
}
