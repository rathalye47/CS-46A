import java.util.ArrayList;

/**
 * Models a Bookshelf.
 * @author Rohan Athalye
 */
public class Bookshelf
{
    private ArrayList<Book> books;
    
    public Bookshelf()
    {
        books = new ArrayList<Book>();
    }
    
    public void add(Book e)
    {
        books.add(e);
    }
    
    public String longest()
    {
        if (books.size() == 0)
        {
            return "";
        }
        
        Book longest = books.get(0);
        int longestPageLength = books.get(0).getPages();
        
        for (Book element : books)
        {
            if (element.getPages() > longestPageLength)
            {
                longestPageLength = element.getPages();
                longest = element;
            }
        }
        
        return longest.getName();
    }
    
    public int bookCount()
    {
        return books.size();
    }
}
