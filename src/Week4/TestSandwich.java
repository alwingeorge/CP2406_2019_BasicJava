package Week4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class TestSandwich
{
    public static void main(String[] args)
    //Instantiate one Sandwich object
    //and demonstrate use of the set and get methods
    {
        Sandwich first = new Sandwich();
        first.setBreadType("Wheat");
        first.setMainIngredient("Ham");
        first.setPrice(1.99);

        System.out.println("Your sandwich is: ");
        System.out.println(first.getMainIngredient() + " on " + first.getBreadType() + " for $" + first.getPrice());

        //Add a secondary sandwich object that demonstrates
        //that the constructor works by displaying the Sandwich's
        //initial values
        Sandwich original = new Sandwich();
        original.setMainIngredient("Turkey");
        original.setBreadType("Rye");
        original.setPrice(5.99);
        System.out.println("The original sandwich was: ");
        System.out.println(original.getMainIngredient() + " on " + original.getBreadType() + " for $" + original.getPrice());



    }
}