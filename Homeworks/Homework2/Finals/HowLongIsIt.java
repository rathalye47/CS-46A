/**
 * Calculates how many days until New Year's Eve 2019
 *
 * @author Rohan Athalye
 */

public class HowLongIsIt
{
    public static void main(String[] args)
    {
        Day today = new Day();
        //do not change this line
        
        Day newYears = new Day(2019, 12, 31);
        System.out.println(newYears);
        
        int todayToNewYears = newYears.daysFrom(today);
        System.out.println(todayToNewYears);
        
        Day todayPlus25 = today.addDays(25);
        
        int year = todayPlus25.getYear();
        System.out.println(year);
        
        int month = todayPlus25.getMonth();
        System.out.println(month);
        
        int day = todayPlus25.getDate();
        System.out.println(day); 
        
        System.out.println("The date is " + today.toString());
    }
}
