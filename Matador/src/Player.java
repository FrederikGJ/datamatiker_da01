import java.util.ArrayList;

public class Player {
    private String name;
    private BankAccount account;
    private int startPosition = 1;
    private int currentPosition = startPosition;


    public Player(String name, int amount) {
        this.name = name;
        account = new BankAccount(amount);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return account.getBalance();
    }


    @Override
    public String toString() {
        return name +":"+ account;

    }

    public void buy(int cost){
        //add deed to deedlist
        this.account.doTransaction(-cost);
    }

    public int updatePos(int sum){

        currentPosition = currentPosition + sum;//52
        if(currentPosition >40){

          //  Field startField = board.getField(1);
          //  this.receive(startField);

            currentPosition -= 40;//currentPosition = currentPosition -40
        }
        return currentPosition;
    }

    public int getPosition() {
        return currentPosition;
    }

    public void pay(int amount) {
        this.account.doTransaction(-amount);
    }

    public void pay (int amount, Player p)
    {
        this.account.doTransaction(-amount);
        p.account.doTransaction(amount);

    }



    public ArrayList<Property> deeds = new ArrayList<Property>();

    public ArrayList<Property> getDeeds()
    {
        return deeds;
    }

    public  void addDeed(Property p)
    {
        deeds.add(p);
    }

    public int getPropertyValues(Player p)
    {
        int values = 0;
        for(Property i : p.deeds)
        {
            values = values + i.getCost();
        }
        return values;

    }


}