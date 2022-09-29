import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{

    private ArrayList<String> coffeeMenu = new ArrayList<>();


    public void loadMenuData()
    {
        File file = new File("/Users/frederikj/Desktop/coffees.txt");

        try{
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
        {
           coffeeMenu.add(scan.nextLine());
        }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Filen findes ikke min ven...   :-) ");
        }
        for (String coffee:
             coffeeMenu)
        {
            System.out.println(coffee);
        }
    }


}