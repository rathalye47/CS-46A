
/**
 * Models a BayWindow.
 *
 * @author Rohan Athalye
 * 
 */
public class BayWindow
{
    private double panelHeight;
    private double middlePanelWidth;
    private double sidePanelWidth;

    /**
     * Constructs a BayWindow with the given height of the panels, middle panel width, and side panel width.
     * @param thePanelHeight the height of the panels.
     * @param theMiddlePanelWidth the width of the middle panel.
     * @param theSidePanelWidth the width of the side panels.
     */
    public BayWindow(double thePanelHeight, double theMiddlePanelWidth, double theSidePanelWidth)
    {
        panelHeight = thePanelHeight;
        middlePanelWidth = theMiddlePanelWidth;
        sidePanelWidth = theSidePanelWidth;
    }
    
    /**
     * Gets the height of this BayWindow.
     * @return the height of this BayWindow.
     */
    public double getHeight()
    {
       return panelHeight;
    }
    
    /**
     * Sets a new height for the BayWindow.
     * @param theHeight the new height for the BayWindow.
     */
    public void setHeight(double theHeight)
    {
        panelHeight = theHeight;
    }
    
    /**
     * Gets the area of the BayWindow.
     * @return the area of the BayWindow.
     */
    public double getArea()
    {
        double area = (panelHeight * middlePanelWidth) + 2 * (panelHeight * sidePanelWidth);
        return area;
    }
}
