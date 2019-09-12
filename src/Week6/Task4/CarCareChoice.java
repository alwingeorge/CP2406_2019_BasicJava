package Week6.Task4;

import javax.swing.*;

public class CarCareChoice {
    public static boolean isMatch = false;
    public static int[] prices = {25, 22, 15, 5};
    public static int x;
    public static int matchIndex = 0;
    public static String menu = "Enter selection:";

    public static void main (String[] args)
    {
        String[] items =  { "oil change", "tire rotation",
                "battery check", "brake inspection"};

        for(x = 0; x < items.length; ++x)
            menu += "\n   " + items[x];
        String selection = JOptionPane.showInputDialog(null, menu);
        for (x = 0; x < items.length; x++)
            if(selection.equals(items[x]))
            {
                isMatch = true;
                matchIndex = x;
            }
        if(isMatch)
            JOptionPane.showMessageDialog(null,
                    selection + " price is $" + prices[matchIndex]);
        else
            JOptionPane.showMessageDialog(null, "Invalid Entry");
    }
}
