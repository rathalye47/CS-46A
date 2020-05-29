
/**
 * Models a Food.
 * @author Rohan Athalye
 */
public class Food extends Product
{
    public static final int MDR = 65;

    private double vitaminC;

    /**
     * Constructs a food with the given description, price, and milligrams of Vitamin C.
     * @param description the description of the food.
     * @param price the price of the food.
     * @param theVitaminC the amount of milligrams of VitaminC in the food.
     */
    public Food(String description, double price, double theVitaminC)
    {
        super(description, price);
        vitaminC = theVitaminC;
    }

    /**
     * Gets the amount of vitaminC in this Food.
     * @return the amount of vitaminC in this Food.
     */
    public double getVitaminC()
    {
        return vitaminC;
    }

    /**
     * Gets how many servings of this food are needed to meet the minimum daily requirement.
     * @return how many servings of this food are needed to meet the minimum daily requirement.
     */
    public double howMuch()
    {
        double servings = 0;

        if (vitaminC == 0)
        {
            return servings;
        }

        servings = MDR / vitaminC;
        return servings;
    }

    /**
     * Overrides the getDescription method in the Product class to return the description and the amount of vitamin C.
     * @return the description and the amount of vitamin C, overriding the getDescription method in the Product class.
     */
    public String getDescription()
    {
        String fullDescription = super.getDescription() + " vitamin C: " + vitaminC;
        return fullDescription;
    }
}
