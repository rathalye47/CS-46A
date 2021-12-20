
import java.util.Scanner;

/**
 * Models a WallpaperJobInvoice.
 *
 * @author Rohan Athalye
 */
public class WallpaperJobInvoice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name of the client: ");
        String clientName = input.nextLine();
        
        System.out.println("Wallpaper Pros");
        System.out.println(clientName);
        
        System.out.print("Enter the length of the room: ");
        double roomLength = input.nextDouble();
        
        System.out.print("Enter the width of the room: ");
        double roomWidth = input.nextDouble();
        
        WallpaperJob totalCost = new WallpaperJob(roomLength, roomWidth);
        
        System.out.println("Total cost: " + totalCost.getJobCost());
        System.out.println(totalCost.getJobCost());
        
    }
}
