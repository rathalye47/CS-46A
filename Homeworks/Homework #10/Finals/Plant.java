
/**
 * Models a Plant.
 * @author Rohan Athalye
 */
public class Plant
{
    private String name;
    private double price;

    /**
     * Constructs a Plant with the given name and price.
     * @param theName the name of this plant.
     * @param thePrice the price of this plant.
     */
    public Plant(String theName, double thePrice)
    {
        name = theName;
        price = thePrice;
    }

    /**
     * Gets the name of the plant.
     * @return the name of the plant.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the price of the plant.
     * @return the price of the plant.
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Sets a new name for the plant.
     * @param newName the new name of the plant.
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Sets a new price for the plant.
     * @param newPrice the new price of the plant.
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
}
