
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

        dogs.add(2, "Siberian Husky");

        dogs.set(3, "Great Dane");

        dogs.set(dogs.size() - 2, "Malamute");

        dogs.remove("Pit Bull");

        String index2 = dogs.get(2);
        System.out.println(index2 + "***");

        System.out.println(dogs.toString());

        for (String dog : dogs)
        {
            System.out.println(dog); 
        }
    }
}
