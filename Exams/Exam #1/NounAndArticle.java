/**
 * Models a noun in Spanish 
 *
 * @author KOBrien
 * 
 */
public class NounAndArticle
{
    private String noun;

    /**
     * Constructor for objects of class NounAndArticle with the
     * given string
     * @param the non for this NounAndArticle
     */
    public NounAndArticle(String word)
    {
        noun = word;
    }

    /**
     * Sets a new noun for this NounAndArticle
     * @param newNoun the new noun
     */
    public void setNoun(String newNoun)
    {
        noun = newNoun;
    }
    
    
    /**
     * Adds an article in front of the noun.
     * @return the article in front of the noun.
     */
    public String addArticle()
    {
        if (noun.substring(noun.length() - 1).equals("a") && !(noun.equalsIgnoreCase("problema")))
        {
            return "la" + " " + noun;
        }
        
        else if (noun.substring(noun.length() - 1).equals("o") && !(noun.equalsIgnoreCase("mano")))
        {
            return "el" + " " + noun;
        }
        
        else if (noun.equalsIgnoreCase("problema"))
        {
            return "el" + " " + noun;
        }
        
        else if (noun.equalsIgnoreCase("mano"))
        {
            return "la" + " " + noun;
        }
        
        else
        {
            return "?" + " " + noun;
        }
    }
}