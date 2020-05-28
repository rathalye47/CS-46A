
/**
 * Models an Animal.
 * @author Rohan Athalye
 */
public class Animal
{
    private int energy;

    /**
     * Constructs an animal with the given amount of energy.
     */
    public Animal()
    {
        energy = 1;
    }

    /**
     * Increases the amount of energy the animal has by amountToEat.
     * @param amountToEat the amount of food the animal eats, which increases the animal's energy.
     */
    public void eat(int amountToEat)
    {
        energy = energy + amountToEat;
    }
    
    /**
     * Decreases the energy the animal has by amountToMove.
     * @param amountToMove the amount of distance the animal moves, which decreases the animal's energy.
     */
    public void move(int amountToMove)
    {
        energy = energy - amountToMove;
    }
    
    /**
     * Returns the amount of energy the animal has left.
     * @return the amount of energy the animal has left.
     */
    public int getEnergy()
    {
        return energy;
    }
}
