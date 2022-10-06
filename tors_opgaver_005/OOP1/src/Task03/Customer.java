package Task03;

public class Customer
{
   private String firstName;
   private String lastName;
   private  String userName;
   private int id;

    public Customer(String firstName, String lastName, String userName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString()
    {
        return "Customer; " + firstName + " " + lastName +
                " with the Username " + userName +
                " and the id: " + id + " ...";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getId()
    {
        return id;
    }
}
