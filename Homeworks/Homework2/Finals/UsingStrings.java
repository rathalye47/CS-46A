/**
 * Use some string methods
 * 
 * @author Rohan Athalye 
 */
public class UsingStrings
{
    public static void main(String[] args)
    {
        String word =  "leEt"; 
        //do not change the line above here
        
        int stringLength = word.length();
        System.out.println(stringLength);
        
        System.out.println(word.toUpperCase());
        
        String changed = word.toLowerCase();
        
        changed = changed.replace("e", "3");
        System.out.println(changed);
        
        word = word.replace("t", "7");
        //and here
        System.out.println("The word is: " + word); // do not change this line
    }
}
