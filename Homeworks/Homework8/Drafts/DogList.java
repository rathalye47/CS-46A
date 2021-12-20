
import java.util.ArrayList;

/**
 * Models a DogList using an ArrayList.
 * @author Rohan Athalye
 */
public class DogList
{
    public static void main(String[] args)
    {
        ArrayList<String> dogs = new ArrayList<String>();

        dogs.add("Pit Bull");
        dogs.add("Collie");
        dogs.add("Irish Setter");
        dogs.add("Rottweiler");
        dogs.add("Boxer");

        for (String dog : dogs)
        {
            System.out.println(dog); 
        }
    }
}
