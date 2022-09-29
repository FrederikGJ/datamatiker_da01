public class TestStudents
{

    public static void main(String[] args)
    {

        Course basic = new Course("Basic Programming");
        Course algorithm = new Course("Algorithms");
        Course web = new Course("Web Programming");
        Course databases = new Course("Databases");

        Student a = new Student("Kat");
        Student b = new Student("Mus");
        Student c = new Student("Hest");

        a.addCourse(basic);
        a.addCourse(algorithm);

        b.addCourse(basic);
        b.addCourse(web);
        b.addCourse(algorithm);

        c.addCourse(basic);
        c.addCourse(databases);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
