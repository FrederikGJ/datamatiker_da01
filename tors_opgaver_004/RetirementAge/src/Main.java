import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your name... ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Please type your age ");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);

        int result = 67 - age;

        System.out.println("You can retire in " + result + " years..... ");





    }
}
