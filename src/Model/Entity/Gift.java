package Model.Entity;

import java.util.ArrayList;
import java.util.List;

public class  Gift {

    public static final int MAX_SWEETS_AMOUNT = 10;

    private double weight; // in grams
    private double price; // in dollars
    private List<Sweet> sweets;

    public Gift() {
        sweets = new ArrayList<Sweet>(0);
    }

    public Gift(List<Sweet> sweets) {
        this.sweets = sweets;
    }
    public Gift(Gift gift){
        sweets = gift.sweets;
        weight = gift.weight;
        price = gift.price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
//        if(price > 0){
//            this.price = price;
//        }
        this.price = price;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }


    public List<Sweet> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweet> sweets) {
        this.sweets = sweets;
    }

    public List<Sweet> getSweetsByIndex(int index) {
        if (index >= 0 && index <= MAX_SWEETS_AMOUNT) {
            return sweets.get(index);
        }
        return new Sweet(); // TODO: throw exception
    }

    public void setSweetByIndex(int index, Sweet sweet) {
        if (index >= 0 && index <= MAX_SWEETS_AMOUNT) {
            sweets.set(index,sweet);
        }

    }

    public int getAmountOfSweets(){

        return sweets.size();
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append("\nGift:\n");
        for(Sweet item : sweets)
            msg.append(item ).append("\n");

        return msg + "";
    }
}
