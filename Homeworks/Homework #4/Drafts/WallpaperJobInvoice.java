
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
        System.out.print(clientName);
    }
}
