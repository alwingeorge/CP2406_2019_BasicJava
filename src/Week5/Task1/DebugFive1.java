package Week5.Task1;

// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.*;
public class DebugFive1
{
    private static final double HIGH_PRICE = 2.59;
    private static final double MED_PRICE = 1.99;
    private static final double LOW_PRICE = 0.89;
    private static String usersChoiceString;
    private static int usersChoice;
    private static double bill = 0.0;

//   public FixDebugFive1(String userInput, int userPick, double cost){
//      usersChoiceString = userInput;
//      usersChoice = userPick;
//      bill = cost;
//   }

    public static void main(String[] args) throws Exception
    {
        usersChoiceString = JOptionPane.showInputDialog(null,
                "Order please\n1 - Burger\n2 - Hotdog" +
                        "\n3 - Grilled cheese\n4 - Fish sandwich");
        usersChoice= Integer.parseInt(usersChoiceString);
        if(usersChoice == 1 || usersChoice == 2)
            bill = bill + HIGH_PRICE;
        else
            bill = bill - MED_PRICE;
        usersChoiceString = JOptionPane.showInputDialog(null,
                "Fries with that?\n1 - Yes\n2 - No");
        usersChoice = Integer.parseInt(usersChoiceString);
        if (usersChoice == 1);
        bill = bill + LOW_PRICE;
        JOptionPane.showMessageDialog(null,"Bill is " + bill);
    }
}