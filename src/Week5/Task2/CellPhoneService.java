package Week5.Task2;
import javax.swing.*;

public class CellPhoneService {
    private static final int TALK_MIN = 500;
    private static final int TEXT_MIN = 100;
    private static final int DATA_MIN = 2;
    private static final int PRICE1 = 49;
    private static final int PRICE2 = 55;
    private static final int PRICE3 = 61;
    private static final int PRICE4 = 70;
    private static final int PRICE5 = 79;
    private static final int PRICE6 = 87;
    private static int price;
    private static String entry;
    private static String message;
    private static String plan;
    private static int talk;
    private static int texts;
    private static int data;

    public static void main(String[] args) {
        entry = JOptionPane.showInputDialog(null,
                "Enter talk minutes needed");
        talk = Integer.parseInt(entry);

        entry = JOptionPane.showInputDialog(null,
                "Enter text messages needed");
        texts = Integer.parseInt(entry);

        entry = JOptionPane.showInputDialog(null,
                "Enter gigabytes of data needed");
        data = Integer.parseInt(entry);

        if(data > 0)
            if(data <= DATA_MIN)
            {
                plan = "E";
                price = PRICE5;
            }
            else
            {
                plan = "F";
                price = PRICE6;
            }
            else
                if(talk < TALK_MIN)
                    if(texts == 0 && data == 0)
                    {
                        plan = "A";
                        price = PRICE1;
                    }
                    else
                    {
                        plan = "B";
                        price = PRICE2;
                    }
                else
                    if(texts < TEXT_MIN)
                    {
                        plan = "C";
                        price = PRICE3;
                    }
                    else
                    {
                        plan = "D";
                        price = PRICE4 ;
                    }
        message = "Plan " + plan + "  $" + price + " per month";
        JOptionPane.showMessageDialog(null, message);
    }
}
