package Task03;

import java.util.ArrayList;

public class Main
{
    public static Customer cos1 = new Customer("Frederik", "John", "FJ");
    public static Customer cos2 = new Customer("Lasse", "Maxi", "LM");
    public static Customer cos3 = new Customer("Basse", "Poulsen", "BP");
    public static Customer cos4 = new Customer("Johanne", "Frode", "JF");
    public static Customer cos5 = new Customer("Ditte", "Knudsen", "DK");
    public static Customer cos6 = new Customer("Josef", "Hans", "JH");

    public static ArrayList<Customer> customers = new ArrayList<>()
    {{
        add(cos1);
        add(cos2);
        add(cos3);
        add(cos4);
        add(cos5);
        add(cos6);

    }};


    public static void main(String[] args)
    {
        printCustomers();
    }

    public static void printCustomers()
    {
        for (Customer customer :
             customers)
        {
            System.out.println(customer);
        }
    }

}
