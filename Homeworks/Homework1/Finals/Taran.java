/**
 * Display a Picture of Taran
 * @author Rohan Athalye
 */
public class Taran
{
    public static void main(String[] args)
    {
        Picture taran = new Picture("taran and family.jpg");
        taran.grow(-240, -180);
        taran.translate(-240, -180);
        taran.draw();
    }
}
