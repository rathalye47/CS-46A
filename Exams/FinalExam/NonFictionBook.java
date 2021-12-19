
/**
 * Models a NonFictionBook.
 * @author Rohan Athalye
 */
public class NonFictionBook extends Book
{
    private double deweyDecimal;
    
    public NonFictionBook(String theName, int thePages, double theDeweyDecimal)
    {
        super(theName, thePages);
        deweyDecimal = theDeweyDecimal;
    }
    
    public double getDeweyDecimal()
    {
        return deweyDecimal;
    }
    
    public void setDeweyDecimal(double newValue)
    {
        deweyDecimal = newValue;
    }
    
    public String getInfo()
    {
        String fullDescription = super.getInfo() + " deweyDecimal: " + deweyDecimal;
        return fullDescription;
    }
}
