package Util;

import Model.Entity.SugarSweet;
import Model.Entity.Sweet;
import Model.Entity.Chocolate;
import java.util.List;
import java.util.Random;

public class Initializator {

    private static final String[] NAMES_OF_SWEETS = {"Jelly", "Lollipop", "Gelatine",
            "Gum", "Marshmallow", "Marmalade", "Toffee"};
    private static final String[] NAMES_OF_CHOCOLATES = {"Alenka", "Alpen Gold",
            "Ritter Sport", "Milka", "Toblerone", "Nestle"};
    private static final int MAX_PRICE = 100;
    private static final int MIN_PRICE = 0;

    private static final int MAX_WEIGHT = 1000;
    private static final int MIN_WEIGHT = 0;

    private static final int[] PERCENT_OF_COCOA = {50,75,95, 72,};
    private static final int[] PERCENT_OF_SUGAR = {47, 50, 53,59, 69, 61};



    public static void init(List<Sweet> sweets){
        Random random = new Random();

        for(Sweet sweet : sweets){
            if(sweet instanceof SugarSweet){
                sweet.setSweetsKind(NAMES_OF_SWEETS[random.nextInt(NAMES_OF_SWEETS.length)]);
                sweet.setPrice(random.nextInt(MAX_PRICE - MIN_PRICE + 1) + MIN_PRICE);
                sweet.setWeight(random.nextInt(MAX_WEIGHT - MIN_WEIGHT +1) + MIN_WEIGHT);
                ((SugarSweet) sweet).setPercentOfSugar(
                        PERCENT_OF_SUGAR[random.nextInt(PERCENT_OF_SUGAR.length)]);
            }
            else if(sweet instanceof Chocolate){
                sweet.setSweetsKind(NAMES_OF_CHOCOLATES[random.nextInt(NAMES_OF_CHOCOLATES.length)]);
                sweet.setPrice(random.nextInt(MAX_PRICE - MIN_PRICE + 1) + MIN_PRICE);
                sweet.setWeight(random.nextInt(MAX_WEIGHT - MIN_WEIGHT +1) + MIN_WEIGHT);
                ((Chocolate) sweet).setPercentOfCocoa(PERCENT_OF_COCOA
                        [random.nextInt(PERCENT_OF_COCOA.length)]);
            }
        }


    }

}
