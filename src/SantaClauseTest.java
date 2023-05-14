
import Model.Entity.Gift;
import Model.Entity.SugarSweet;
import Model.Entity.Sweet;
import Model.Logic.SantaClause;
import View.Printer;
import org.junit.*;
import Model.Entity.Chocolate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class SantaClauseTest {

    private  Gift gift;

    @Before
    public  void init(){

        Sweet sweet1 = new Chocolate(300,400,"Jelly",75);
        Sweet sweet2 = new SugarSweet(100,100,"Jelly",40);
        Sweet sweet3 = new Chocolate(250,10,"Choco",50);
        Printer.print("\nStart");
        List<Sweet> sweets = new ArrayList<Sweet>();
        sweets.add(sweet1);
        sweets.add(sweet2);
        sweets.add(sweet3);
        gift = new Gift(sweets);
    }

    @After
    public  void destroy(){
        Printer.print("\nEnd");
        gift = null;
    }


    @Test
    public void testCalculateGiftsPrice() {
        double expected = 510;
        double actual = SantaClause.calculateGiftsPrice(gift);


        if(expected != actual){
            fail();
        }

    }

    @Test(timeout = 5000)
    public void testCalculateGiftsPriceTime(){
        double actual =  SantaClause.calculateGiftsPrice(gift);
    }

    @Test
    public void testCalculateGiftsPriceIfGiftIsNULL(){
        double expected = 0;

        double actual =  SantaClause.calculateGiftsPrice(null);
        assertEquals(expected,actual, 0.0001);
    }

    @Test
    public void testCalculateGiftsWeight() {
        double expected = 650;
        double actual = SantaClause.calculateGiftsWeight(gift);


        if(expected != actual){
            fail();
        }

    }

    @Test(timeout = 5000)
    public void testCalculateGiftsWeightTime(){
        double aclual =  SantaClause.calculateGiftsWeight(gift);
    }

    @Test
    public void testCalculateGiftsWeightIfGiftIsNULL(){
        double expected = 0;

        double actual =  SantaClause.calculateGiftsWeight(null);
        assertEquals(expected,actual, 0.0001);
    }

    @Test
    public void testFindMostExpensiveSweetness() {
        List<Sweet> expected = gift.getSweetsByIndex(0);
        List<Sweet> actual = SantaClause.findMostExpensiveSweetness(gift);

        //assertEquals(expected,actual, 0.0001);
        if(expected != actual){
            fail();
        }

    }

    @Test(timeout = 5000)
    public void testFindMostExpensiveSweetnessTime(){
        List<Sweet> actual = SantaClause.findMostExpensiveSweetness(gift);
    }
}
