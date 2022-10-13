import java.util.ArrayList;

public class Main
{
    private static ArrayList<String> kurser = new ArrayList<>(){{
       add("Programmering");
       add("Økonomi");
       add("Datastrukturer");


    }};

    private static ArrayList<String> kurser01 = new ArrayList<>(){{
        add("Programmering");
        add("Økonomi");
        add("Datastrukturer");
        add("Java 1.0");

    }};

    private static ArrayList<String> undervis = new ArrayList<>(){{
        add("Programmering");
        add("Økonomi");
        add("Algebra");
        add("Java 1.0");

    }};

    private static ArrayList<String> undervis01 = new ArrayList<>(){{
        add("Programmering");
        add("Økonomi");
        add("Algebra");


    }};

   static Student st01 = new Student("John", kurser);
    static  Student st02 = new Student("Kat", kurser);
    static Student st03 = new Student("Mike", kurser01);
    static Student st04 = new Student("Jules", kurser01);


    static Teacher tea01 = new Teacher("Peter", undervis);
    static Teacher tea02 = new Teacher("Julie", undervis01);

    private static ArrayList<Person> persons = new ArrayList<>(){{
       add(st01);
       add(st02);
       add(st03);
       add(st04);
       add(tea01);
       add(tea02);
    }};


    public static void main(String[] args)
    {
        for (Person i:
        persons)
        {
           if( i.addCourse("Java 1.0") == false)
           {
               // pseudokode - if student skriv: har allerede bestået, if Teacher skriv:

               System.out.println(i.getName());
           }

        }

    }

}
