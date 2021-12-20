
/**
 * Models an RGBRectangle.
 * @author Rohan Athalye
 */
public class RGBRectangle extends Rectangle
{
    private String rgbColor;

    /**
     * Constructs an RGBRectangle with the given x-coordinate, y-coordinate, width, and height.
     * @param theX the x-coordinate of the Rectangle.
     * @param theY the y-coordinate of the Rectangle.
     * @param theWidth the width of the Rectangle.
     * @param theHeight the height of the Rectangle.
     */
    public RGBRectangle(double theX, double theY, int theWidth, int theHeight)
    {
        super(theX, theY, theWidth, theHeight);
        rgbColor = "gray";
        super.setColor(Color.GRAY);
    }

    /**
     * Sets the rgbColor instance variable to the new color and calls the super class setColor method to set the appropriate color.
     * @param newColor the new color of the Rectangle.
     */
    public void setRGBColor(String newColor)
    {

    }

    /**
     * Gets the RGB color of this Rectangle as a string.
     * @return the RGB color of this Rectangle as a string.
     */
    public String getRGBColor()
    {
        return rgbColor;
    }
}
