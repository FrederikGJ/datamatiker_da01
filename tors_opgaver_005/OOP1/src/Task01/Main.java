package Task01;

public class Main
{

    public static Driver driver01 = new Driver("Frederik",34);
    public static Car car01 = new Car("subaru", "impreza WRX",2018,"Rally");

    public static Car car02 = new Car("Skoda","Fabia",1998,"Sedan");


    public static void main(String[] args)
    {
        car01.setDriver(car01.driver);
        System.out.println(car01.toString());
        System.out.println(driver01.toString());

        car02.setDriver(car02.driver);
        System.out.println(car02.toString());
        System.out.println(driver01.toString());

    }
}
