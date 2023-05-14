package Model.Entity;

public class Chocolate extends Sweet{
    private int percentOfCocoa;

    public Chocolate(){

    }

    public Chocolate(double weight, double price, String sweetsKind, int percentOfChocolate){
        super(weight,price,sweetsKind);
        this.percentOfCocoa = percentOfChocolate;
    }

    public int getPercentOfCocoa() {
        return percentOfCocoa;
    }

    public void setPercentOfCocoa(int percentOfChocolate) {
        this.percentOfCocoa = percentOfChocolate;
    }

    @Override
    public String toString(){
        return getSweetsKind()+
                ", Price: " + getPrice() + "$" +
                ", Weight: " + getWeight() + " grams" +
                ", Percent of chocolate: " + getPercentOfCocoa() + "%";
    }

}

