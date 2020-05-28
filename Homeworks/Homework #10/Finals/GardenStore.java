
import java.util.ArrayList;

/**
 * Models a GardenStore.
 * @author Rohan Athalye
 */
public class GardenStore
{
    private ArrayList<Plant> plants;

    /**
     * Constructs an empty ArrayList of plants.
     */
    public GardenStore()
    {
        plants = new ArrayList<Plant>();
    }

    /**
     * Adds the specified Plant to the GardenStore.
     * @param plantElement the specified Plant to be added to the GardenStore.
     */
    public void add(Plant plantElement)
    {
        plants.add(plantElement);
    }

    /**
     * Finds the total cost of all Plants in the GardenStore.
     * @return the total cost of all  Plants in the GardenStore.
     */
    public double sum()
    {
        double total = 0;

        for (Plant element : plants)
        {
            total = total + element.getPrice();
        }

        return total;
    }

    /**
     * Determines if a Plant with a given name is in the GardenStore.
     * @param plantName the name of the plant.
     * @return true if a Plant with that name is in the GardenStore, otherwise false.
     */
    public boolean contains(String plantName)
    {
        boolean found = false;
        int i = 0;
        
        if (plants.size() != 0)
        {
            while (i < plants.size() && !found)
            {
                Plant plant = plants.get(i);
                
                if (plant.getName().equals(plantName))
                {
                    found = true;
                }
                
                else 
                {
                    i++;
                }
            }
        }
        
        return found;
    }

    /**
     * Gets an ArrayList<String> containing the names of the Plants in the GardenStore.
     * @return an ArrayList<String> containing the names of the Plants  in the GardenStore.
     */
    public ArrayList<String> plantList()
    {
        ArrayList<String> namesOfPlants = new ArrayList<String>();

        for (Plant element : plants)
        {
            namesOfPlants.add(element.getName());
        }

        return namesOfPlants;
    }
}
