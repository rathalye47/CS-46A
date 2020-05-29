/**
 * Models a book with a name and pages
 */
public class Book implements Comparable
{
    private String name;
    private int pages;

    /**
     * Constructs a Book with the given information
     * @param theName the name of this Book
     */
    public Book(String theName,  int numberOfPages)
    {
        name = theName;
        pages = numberOfPages;
    }

    /**
     * Gets the name of this Book
     * @return the name of this Book
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the number of pages in this Book
     * @return the number of pages in this Book
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * Gets information about this Book
     * @return information about this Book
     */
    public String getInfo()
    {
        String s = "name: " + name + " numberOfPages: " + pages;
        return s;
    }
    
    public int compareTo(Object otherObject)
    {
        Book otherBook = (Book) otherObject;
        
        if (pages - otherBook.pages == 0)
        {
            return name.compareTo(otherBook.name);
        }
        
        return pages - otherBook.pages;
    }
}