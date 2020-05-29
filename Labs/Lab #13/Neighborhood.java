// BlueJ project: lesson9/scene1
import java.util.ArrayList;

public class Neighborhood
{
    public static void main(String[] args)
    {

        /**
        ArrayList<House> houses = new ArrayList<House>();
        houses.add(new House(100, 150, 100, 100));
        houses.add(new House(250, 100, 150, 150));

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(200, 100, "Fido.jpg"));
        dogs.add(new Dog(100, 400, "Rex.jpg"));
        dogs.add(new Dog(200, 400, "Lucky.jpg"));

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(100, 300));
        cars.add(new Car(250, 300));
        cars.add(new Car(250, 350));
        // Add cars at (100, 300), (250, 300), (250, 350) to ann array list
        //draw the cars.

        for (House h : houses)
        {
        h.draw();
        }

        for (Dog d : dogs)
        {
        d.draw();
        }

        for (Car c : cars)
        {
        c.draw();
        }
         */

        ArrayList<Drawable> drawables = new ArrayList<Drawable>();
        drawables.add(new House(100, 150, 100, 100));
        drawables.add(new House(250, 100, 150, 150));

        drawables.add(new Dog(200, 100, "Fido.jpg"));
        drawables.add(new Dog(100, 400, "Rex.jpg"));
        drawables.add(new Dog(200, 400, "Lucky.jpg"));

        drawables.add(new Car(100, 300));
        drawables.add(new Car(250, 300));
        drawables.add(new Car(250, 350));

        drawables.add(new Ball(50, 100));
        drawables.add(new Ball(170, 60));
        drawables.add(new Ball(100, 100));

        for (Drawable d : drawables)
        {
            d.draw(); 
        }

        for (int i = 1; i <= 10; i++)
        {
            for (Drawable d : drawables)
            {
                // TODO: Move those elements that are moveable for 1 second each
                if (d instanceof Moveable)
                {
                    Moveable m = (Moveable) d;
                    m.move(2);
                }
                Canvas.snapshot();
            }
        }
    }
}
