import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{
    private static ArrayList<String> options = new ArrayList();

    public Menu(ArrayList<String> options)
    {
        this.options = options;
    }

    public static String showMenu()
    {

        System.out.println("type a number to choose: ");
        for (String s :
             options)
        {
            System.out.println(s);
        }

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;

    }


}
