
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);


           if( scan.hasNextInt())
           {

               int in = scan.nextInt();
               System.out.println("dit nummer er " + in);

               if (in == rnd_number)
               {
                   System.out.println("You won the game!! ");
               } else
               {
                   System.out.println("Try again! ");
                   if(in > rnd_number)
                   {
                       System.out.println("nummeret er mindre end " + in);
                   }
                   else
                   {
                       System.out.println("nummeret er større end " + in);
                   }
                   makeAGuess();
               }
           }
           else
           {
               System.out.println("Wrong... Please write an integer");
               makeAGuess();
           }

        // Read user input
        //use hasNextInt to check if input is numeric,


        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison (was it the right number?)
        //   If it was NOT the right number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)

        //   Help the user by revealing wether the guess was lower or higher than the target number

        // if input was not numeric show an error message and call this method recursively

    }
}
