
/**
 * Models a Plant.
 * @author Rohan Athalye
 */
public class Plant implements Comparable
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

    /**
     * Gets the corresponding integer when comparing two plants.
     * @param otherObject the object with which we are comparing the current object to.
     * @return the corresponding integer when comparing two plants.
     */
    public int compareTo(Object otherObject)
    {
        Plant otherPlant = (Plant) otherObject;

        if (Double.compare(price, otherPlant.price) == 0)
        {
            return name.compareTo(otherPlant.name);
        }

        return Double.compare(price, otherPlant.price);
    }
}
