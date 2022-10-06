package Task01;

public class Car
{
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    public String driver;

    public Car(String make, String model, int year, String bodyStyle)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public String getDriver()
    {
        return driver;
    }

    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    @Override
    public String toString()
    {
        return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle;
    }
}
