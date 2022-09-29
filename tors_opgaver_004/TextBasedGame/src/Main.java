import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> actions = new ArrayList<>()
        {{

                add("1: start game");
                add("2 : resume game");
                add("3 : pause game");
                add("4 : end game");

        }};

        Menu menu1 = new Menu(actions);

        String str = menu1.showMenu();
        int convertedResponse = Integer.parseInt(str);
        doAction(convertedResponse);

        

    }

     public static void doAction(int action)
     {
         switch (action)
         {
             case 1 -> System.out.println("Starting the game now");
             case 2 -> System.out.println("Fetching previously saved game data");
             case 3 -> System.out.println("Game paused");
             case 4 -> System.out.println("Ending game");
         }
     }

}
