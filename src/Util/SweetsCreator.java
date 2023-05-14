package Util;

import Model.Entity.SugarSweet;
import Model.Entity.Sweet;
import Model.Entity.Chocolate;
import Model.Exception.ImpossibleAmountOfSweets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SweetsCreator {
    public static final int MIN_AMOUNT = 1;
    public static final int MAX_AMOUNT = 20;

    public static boolean isNecessaryAmount(int size){

        return size >=MIN_AMOUNT && size <=MAX_AMOUNT;
    }


    public static List<Sweet> create(int size) throws ImpossibleAmountOfSweets {
        if (!isNecessaryAmount(size)) {
            throw new ImpossibleAmountOfSweets();
        }


        List<Sweet> sweets = new ArrayList<Sweet>(size);
        Random random = new Random();
        for(int i = 0; i < size; i++){
            int numb = random.nextInt(2);
            if(numb == 1){
                sweets.add(i, new SugarSweet());

            }
            else {
                sweets.add(i, new Chocolate());
            }
        }
        return sweets;
    }
}
