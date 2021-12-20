
/**
 * Models a BetterAnimal.
 * @author Rohan Athalye
 */
public class BetterAnimal extends Animal
{
    private int maxEnergy;

    /**
     * Constructs a BetterAnimal with the given amount of maximum energy the animal can have.
     * @param theMaxEnergy the maximum amount of energy an animal can have.
     */
    public BetterAnimal(int theMaxEnergy)
    {
        maxEnergy = theMaxEnergy;
    }

    /**
     * Overriden method that sets some limits on how much the animal can eat.
     * @param amountToEat the amount of food the animal eats.
     */
    public void eat(int amountToEat)
    {
        if (amountToEat > 0)
        {
            if (getEnergy() + amountToEat > maxEnergy)
            {
                super.eat(maxEnergy - getEnergy());
            }

            else
            {
                super.eat(amountToEat);
            }
        }
    }

    /**
     * Overriden method that sets some limits on how much the animal can move.
     * @param amountToMove the amount of distance the animal moves.
     */
    public void move(int amountToMove)
    {
        if (amountToMove > 0)
        {
            if (getEnergy() - amountToMove < 0)
            {
                super.move(getEnergy());
            }

            else
            {
                super.move(amountToMove);
            }
        }
    }
}
