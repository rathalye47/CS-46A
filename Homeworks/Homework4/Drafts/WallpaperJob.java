
/**
 * Models a wallpapering job for Wallpaper Pros.
 *
 * @author Rohan Athalye
 */
public class WallpaperJob
{
    public static final int SQ_INCHES_PER_SQ_FOOT = 144;
    public static final double WALL_HEIGHT_IN_FEET = 8;
    public static final double DOOR_HEIGHT_IN_INCHES = 80;
    public static final double DOOR_WIDTH_IN_INCHES = 32;
    public static final int INCHES_PER_FOOT = 12;
    public static final double COST_OF_LABOR_PER_SQ_FOOT = 1.10;
    public static final double COST_OF_WALLPAPER_ROLL = 40;
    public static final double WALLPAPER_ROLL_WIDTH_IN_INCHES = 27;
    public static final double WALLPAPER_ROLL_HEIGHT_IN_FEET = 33;
    
    private double length;
    private double width;
    
    /**
     * Constructs a new WallpaperJob with the given length and width.
     * @param length the length of the room of this WallpaperJob.
     * @param width the width of the room of this WallpaperJob.
     */
    public WallpaperJob(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Gets the length of the room in this WallpaperJob.
     * @return the length of the room in this WallpaperJob.
     */
    public double getLength()
    {
        return this.length;
    }
    
    /**
     * Gets the width of the room in this WallpaperJob.
     * @return the width of the room in this WallpaperJob.
     */
    public double getWidth()
    {
        return this.width;
    }
    
    /**
     * Sets a new length and width for the room in this WallpaperJob.
     * @param theLength the new length for the room in this WallpaperJob.
     * @param theWidth the new width for the room in this WallpaperJob.
     */
    public void setDimensions(double theLength, double theWidth)
    {
        this.length = theLength;
        this.width = theWidth;
    }
}
