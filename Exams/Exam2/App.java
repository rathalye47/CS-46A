public class App
{
    private String name;
    private double price;

    public App(String theName, double thePrice)
    {
        name = theName;
        price = thePrice;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setPrice(double newPrice)
    {
        price = newPrice;
    }

    public double getPrice()
    {
        return price;
    }
}
