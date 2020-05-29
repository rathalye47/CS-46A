
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
     * Constructs an RGBRectangle with the given x-coordinate, y-coordinate, width, height, and color (as a String).
     * @param aX the x-coordinate of the Rectangle.
     * @param aY the y-coordinate of the Rectangle.
     * @param aWidth the width of the Rectangle.
     * @param aHeight the height of the Rectangle.
     * @param theRgbColor the String color of the Rectangle.
     */
    public RGBRectangle(double aX, double aY, int aWidth, int aHeight, String theRgbColor)
    {
        super(aX, aY, aWidth, aHeight);
        rgbColor = theRgbColor;
        setRGBColor(theRgbColor);
    }

    /**
     * Sets the rgbColor instance variable to the new color and calls the super class setColor method to set the appropriate color.
     * @param newColor the new color of the Rectangle.
     */
    public void setRGBColor(String newColor)
    {
        if (newColor.equals("red"))
        {
            super.setColor(Color.RED);
        }

        else if (newColor.equals("green"))
        {
            super.setColor(Color.GREEN);
        }

        else if (newColor.equals("blue"))
        {
            super.setColor(Color.BLUE);
        }

        else
        {
            super.setColor(Color.GRAY);
            newColor = "gray";
        }

        rgbColor = newColor;
    }

    /**
     * Gets the RGB color of this Rectangle as a string.
     * @return the RGB color of this Rectangle as a string.
     */
    public String getRGBColor()
    {
        return rgbColor;
    }

    /**
     * Overriden method so the user can not set the color of the rectangle to an invalid color like GREEN. The color can only be changed using setRGBColor.
     * @param aColor the color of the Rectangle.
     */
    public void setColor(Color aColor)
    {

    }
}
