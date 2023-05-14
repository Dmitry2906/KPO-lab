package Model.Logic;

import Model.Entity.Gift;
import Model.Entity.Sweet;


import java.util.Comparator;
import java.util.List;

public class SantaClause {

    public static double calculateGiftsPrice(Gift gift) {

        if (gift == null) {
            return 0;
        }

        double totalPrice = 0;

        for (Sweet item : gift.getSweets()) {
            totalPrice += item.getPrice();
        }

        return totalPrice;


    }

    public static double calculateGiftsWeight(Gift gift) {

        if (gift == null){
            return 0;
        }

        double totalWeight = 0;

        for (Sweet item : gift.getSweets()) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public static List<Sweet> findMostExpensiveSweetness(Gift gift) {

        Sweet mostExpensiveSweet = (Sweet) gift.getSweetsByIndex(0);

        for (Sweet item : gift.getSweets()) {
            if (mostExpensiveSweet.getPrice() < item.getPrice()) {
                mostExpensiveSweet = item;
            }
        }
        return mostExpensiveSweet;
    }


}


