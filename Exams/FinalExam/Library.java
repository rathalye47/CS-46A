import java.util.ArrayList;

/**
 * Models a Library.
 * @author Rohan Athalye
 */
public class Library
{
    private Book[] books;

    public Library(Book[] theBooks)
    {
        books = theBooks;
    }

    public double getAverageLength()
    {
        if (books.length == 0)
        {
            return 0;
        }

        double total = 0.0;

        for (Book element : books)
        {
            total = total + element.getPages();
        }

        double average = 0.0;

        if (books.length > 0)
        {
            average = total / books.length;
        }

        return average;
    }

    public ArrayList<String> nameList()
    {
        ArrayList<String> bookNames = new ArrayList<String>();

        if (books.length == 0)
        {
            return bookNames;
        }

        for (Book element : books)
        {
            String name = element.getName();

            if (name.substring(0,1).equals("A") || name.substring(0,1).equals("B") || name.substring(0,1).equals("C"))
            {
                bookNames.add(name);
            }
        }

        return bookNames;
    }
}
