
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
    public static final double LABOR_COST_PER_SQ_FOOT = 1.1;
    public static final double COST_OF_WALLPAPER_ROLL = 40;
    public static final double WALLPAPER_ROLL_WIDTH_IN_INCHES = 27;
    public static final double WALLPAPER_ROLL_HEIGHT_IN_FEET = 33;
    
    private double length;
    private double width;
    
    /**
     * Constructs a new WallpaperJob with the given length and width of the room.
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
    
    /**
     * Gets the area to the wallpaper.
     * @return the area to the wallpaper.
     */
    public double getArea()
    {
        double area = (2 * (this.width * WALL_HEIGHT_IN_FEET) + 2 * (this.length * WALL_HEIGHT_IN_FEET) + (this.width * this.length)) - (DOOR_HEIGHT_IN_INCHES * DOOR_WIDTH_IN_INCHES) / SQ_INCHES_PER_SQ_FOOT;
        return area;
    }
    
    /**
     * Gets the cost of the wallpaper for the job.
     * @return the cost of the wallpaper for the job.
     */
    public double getCostOfWallpaper()
    {
        double wallpaperCost = ((getArea() / (WALLPAPER_ROLL_HEIGHT_IN_FEET * (WALLPAPER_ROLL_WIDTH_IN_INCHES / INCHES_PER_FOOT)) * COST_OF_WALLPAPER_ROLL)); 
        return wallpaperCost;
    }
    
    /**
     * Gets the cost of this WallpaperJob.
     * @return the cost of this WallpaperJob.
     */
    public double getJobCost()
    {
        double jobCost = (getArea() * LABOR_COST_PER_SQ_FOOT) + getCostOfWallpaper();
        return jobCost;
    }
}
