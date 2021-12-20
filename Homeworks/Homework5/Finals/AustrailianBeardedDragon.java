/**
 * Models a AustrailianBeardedDragon climbing a tree
 * 
 * @author Rohan Athalye
 */
public class AustrailianBeardedDragon
{

    public static final int TREE_TOP = 10;

    private String gender;
    private int position;

    /**
     * Constructs a new AustrailianBeardedDragon with the given gender and position. 
     * @param theGender the gender of this AustrailianBeardedDragon
     * @param thePosition the starting potition on the tree
     */
    public AustrailianBeardedDragon (String theGender, int thePosition)
    {
        gender = theGender;
        position = thePosition;
        
        if (position < 0)
        {
            position = 0;
        }
        
        else if (position > TREE_TOP)
        {
            position = TREE_TOP;
        }
        
        this.setGender(theGender);
    }

    /**
     * Gets the gender of this AustrailianBeardedDragon
     * @return the gender of this AustrailianBeardedDragon
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * Gets the position on the tree of this AustrailianBeardedDragon
     * @return the position on the tree of this AustrailianBeardedDragon
     */
    public int getPosition()
    {
        return position;
    }

    /**
     * Sets the new gender for this AustrailianBeardedDragon
     * @param newGender the new gender for this AustrailianBeardedDragon
     */
    public void setGender(String newGender)
    {
        if (newGender != "male" && newGender != "female")
        {
            newGender = "female";
            gender = newGender;
        }
        
        else
        {
            gender = newGender;
        }
    }

    /**
     * Climb one unit on the tree
     */
    public void climb()
    {
        if (position >= TREE_TOP)
        {
            position = TREE_TOP;
        }

        else
        {
            position = position + 1;
        }
    }

    /**
     * returns the AustrailianBeardedDragon to the bottom of the tree.
     */
    public void slide()
    {
        position = 0;
    }  
}
