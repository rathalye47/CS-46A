/**
 * Models a television with a brand and a screen size in inches.
 * @author Rohan Athalye
 */
public class TV 
{
    private String brand;
    private double size;

    /**
     * Constructs a TV with the given brand and screen size.
     * @param theBrand the brand of the TV.
     * @param theSize the screen size of the TV.
     */
    public TV(String theBrand, double theSize)
    {
        brand = theBrand;
        size = theSize;
    }

    /**
     * Gets the screen size of the TV.
     * @return the screen size of the TV.
     */
    public double getSize()
    {
        return size;
    }

    /**
     * Gets the brand of the TV.
     * @return the brand of the TV.
     */
    public String getBrand()
    {
        return brand;
    }

    /**
     * Gets a string representation of the object.
     * @return a string representation of the object.
     */
    public String toString()
    {
        String s = getClass().getName()
            + "[brand=" + brand
            + ",size=" + size 
            + "]";
        return s;
    }
}
