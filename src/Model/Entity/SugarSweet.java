package Model.Entity;

public class SugarSweet extends Sweet {
    //private String name;
    private int percentOfSugar;

    public SugarSweet(){

    }


    public SugarSweet(double weight, double price, String sweetsKind, int percentOfSugar){
        super(weight, price, sweetsKind);
        this.percentOfSugar = percentOfSugar;
    }

    public int getPercentOfSugar() {
        return percentOfSugar;
    }

    public void setPercentOfSugar(int percentOfSugar) {
        this.percentOfSugar = percentOfSugar;
    }

    @Override
    public String toString() {
        return  getSweetsKind()+
                ", Price: " + getPrice() + "$" +
                ", Weight: " + getWeight() + " grams" +
                ", Percent of sugar: " + getPercentOfSugar() + "%";

    }
}


