public class Property extends Field{
    protected int seriesID;
    protected Player owner;
    protected String option;


    public Property(int id, String label, int cost, int income, int seriesID) {
        super(id, label, cost, income);
        this.seriesID = seriesID;
    }


    @Override
    public String toString() {
        String s = super.toString();
        return s+" tilhører serie: "+this.seriesID;
    }
    @Override
    public String onLand(Player p){
        String s = super.onLand(p);
        if (this.owner == null){
            option = "buy";
            s += "\n Vil du købe "+this.getLabel()+ "f or " + this.cost +
                    " kr. Din saldo er nu: " + p.getBalance() +
                    " \n Tast J for ja N for nej.";

        }
        else
        {
            option = "payRent";
            s += "\n" + this.owner.getName() + " er ejern af " + this.getLabel();
            s += "\n Du skal betale lejen for at opholde dig på gruden. Det koster " + this.getIncome() +
                    " \n tast J for ja eller tast N for nej.";
        }


        return s;
    }
    @Override
    protected String onAccept(Player p){
        String s="";

        if(option.equals("buy")){
            s = this.getLabel()+" er din!";

            p.buy(this.cost);

            //save a deed at the player
            p.addDeed(this);

            this.owner = p;

        }
        else if (option.equals("payRent"))
        {
            s = "Du har betalt din husleje";
            p.pay(getIncome(), this.owner);
        }
        return s;
    }
    @Override
    protected String onReject(Player p){
        return "";
    }

}
