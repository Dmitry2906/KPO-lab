package Controller;

import Model.Entity.Gift;
import Model.Entity.Sweet;
import Model.Exception.ImpossibleAmountOfSweets;
import Model.Logic.SantaClause;
import Util.SweetsCreator;
import Util.Initializator;
import View.Printer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter amount of sweets: ");

            int sweetsAmount = in.nextInt();
            List<Sweet> sweets = SweetsCreator.create(sweetsAmount);
            Initializator.init(sweets);
            Gift gift = new Gift(sweets);
            int count = 0;
            String menu = "\n\t\tMenu: " +
                    "\n1. Print gift;" +

                    "\n2. Print info about the most expensive sweet in gift;" +
                    "\n3. Print weight and price of the gift;" +

                    "\n4. Exit;\n";
            String msg="";
            boolean flag = true;
            while(flag) {


                Printer.print(menu);
                int choice = in.nextInt();

                switch (choice){
                    case 1:
                        msg = "\n\n\tInfo about the gift:\n " + gift;

                        Printer.print(msg);
                        count++;
                        break;

                    case 2:
                        msg = "\n\n\tInfo about the most expensive sweet in gift: \n" +
                                SantaClause.findMostExpensiveSweetness(gift)+"\n";

                        Printer.print(msg);
                        count++;
                        break;
                    case 3:
                        msg = "\n\nGift weight: " + SantaClause.calculateGiftsWeight(gift) + "grams" +
                                "\nGift price: " + SantaClause.calculateGiftsPrice(gift) + "$\n";

                        Printer.print(msg);
                        count++;
                        break;
                    case 4:
                        flag = false;
                        break;

                    default:
                        Printer.print("Enter incorrect action number!!!");


                }

            }

        } catch (ImpossibleAmountOfSweets ex) {
            Printer.print("Input incorrect amount of sweets!!" +
                    "\nCorrect range " + SweetsCreator.MIN_AMOUNT + "..." + SweetsCreator.MAX_AMOUNT);
        } catch (InputMismatchException exception) {
            Printer.print("Input incorrect data!!");
        }
    }
}
