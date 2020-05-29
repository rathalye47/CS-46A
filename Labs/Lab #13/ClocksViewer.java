import java.util.ArrayList;

public class ClocksViewer
{
    public static void main(String[] args)
    {
        ArrayList<Clock> clocks;

        //add clocks to the array list
        clocks = new ArrayList<Clock>();
        Clock clock1 = new Clock();
        clocks.add(clock1);
        ColoredClock clock2 = new ColoredClock();
        clock2.moveTo(100, 100);
        clocks.add(clock2);

        Clock clock3 = new WorldClock("Honolulu", -3);
        clock3.moveTo(0, 200);
        clocks.add(clock3);

        Clock clock4 = new WorldClock("London", 8);
        clock4.moveTo(100, 200);
        clocks.add(clock4);

        for (Clock c : clocks)
        {
            c.draw();
        }

    }
}
