package Week3;
import java.util.Scanner;
public class Dollars {
    public static void main(String[] args){
        double amount;
        double twenties, tens, fives, ones;

        Scanner scan = new Scanner (System.in);

        System.out.println ("Enter dollar amount: ");

        amount = scan.nextDouble();

        twenties = (int) amount / 20;
        tens = (int) amount / 10;                        //number of tens needed
        fives = (int) (amount % 10) / 5;               //# of fives needed
        ones = (int) amount % 5;                                //# of ones needed


        System.out.println (twenties + " twenty dollar bills");
        System.out.println (tens + " ten dollar bills");
        System.out.println (fives + " five dollar bills");
        System.out.println (ones + " one dollar bills");

    }
}

