import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class Text
{
    private ArrayList<String> words;

    public Text()
    {
        words = new ArrayList<String>();
    }

    public void removeAdjacentDuplicates()
    {
        int i = 1;

        while (i < words.size())
        {
            if (words.get(i - 1).equals(words.get(i)))
            {
                words.remove(i);
                i = i - 1;
            }

            else
            {
                i = i + 1;
            }
        }
    }

    public void removeAllDuplicates()
    {
        int i = 1;
        ArrayList<String> strings = new ArrayList<String>();
        strings.add(words.get(0));

        while (i < words.size())
        {
            if (strings.contains(words.get(i)))
            {
                words.remove(i);
            }

            else
            {
                i = i + 1;
            }

            strings.add(words.get(i - 1));
        }
    }

    /**
    Gets the words from this text.
    @return an array list containing the words
     */
    public ArrayList<String> getWords()
    {
        return words;
    }

    // Don't look at the code below...

    /**
    Lets the user pick a file for loading
     */
    public void pick()
    {
        JFileChooser chooser = new JFileChooser(".");
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            load(chooser.getSelectedFile().getAbsolutePath());
        }
    }   

    /**
    Loads a file.
    @param source a URL or file name
     */
    public boolean load(String source)
    {
        if (source == null) return false;
        try
        {
            Scanner in;
            if (source.startsWith("http://"))
            {
                in = new Scanner(new URL(source).openStream());
            }
            else
            {
                in = new Scanner(new FileReader(source));
            }
            in.useDelimiter("[^\\p{L}]");
            words = new ArrayList<String>();
            while (in.hasNext())
            {
                String word = in.next();
                if (word.length() > 0)
                    words.add(word);
            }
            return true;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

    /**
    Displays the words in a text area
     */
    public void explore()
    {
        JTextArea area = new JTextArea(20, 40);
        JScrollPane scroll = new JScrollPane(area);
        for (String word : words)
            area.append(word + "\n");
        JOptionPane.showMessageDialog(null, scroll);    
    }
}