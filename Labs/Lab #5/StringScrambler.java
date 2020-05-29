public class StringScrambler
{
   public String scramble(String word)
   {
      if (word.length() > 3)
      {
          //String lastLetter = word.substring(word.length() - 1);
          //String allButFirstAndLast = word.substring(1, word.length() - 1);
          //String firstLetter = word.substring(0, 1);
          //return lastLetter + allButFirstAndLast + firstLetter;
          String firstLetter = word.substring(0,1);
          char secondLetter = word.charAt(1);
          char thirdLetter = word.charAt(2);
          String lastLetter = word.substring(word.length() - 1);
          return firstLetter + thirdLetter + secondLetter + lastLetter;
          
      }
      
      else
      {
          String error = "This is not a valid word.";
          return error;
      }
      
   }

   /**
      Returns a random integer between begin and pastEnd - 1
      @param begin the lower bound (inclusive)
      @param end the upper bound (exclusive)
   */
   public int randomInt(int begin, int pastEnd)
   {
      return begin + (int)((pastEnd - begin) * Math.random());
   }

   /**
      Scrambles all words of length > 3 in a given sentence, after stripping off 
      white space and punctuation marks (except for '). Do not look inside this
      method. If you do, be sure to avert your eyes from the split method call, or permanent eye damage may occur.
      @param sentence a string consisting of one or more words
      @return the string witht the words scrambled
   */
   public String scrambleSentence(String sentence)
   {
      String result = "";
      for (String w : sentence.split("[\\s\\p{Punct}&&[^']]+"))
      {
         String r;
         if (w.length() > 3) r = scramble(w);
         else r = w;
         result = result + r + " ";
      }

      return result;
   }

}