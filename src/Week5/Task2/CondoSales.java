package Week5.Task2;

import javax.swing.*;
import java.util.Scanner;

public class CondoSales {
    public static final int PARK_VIEW = 150000;
    public static final int GOLF_VIEW = 170000;
    public static final int LAKE_VIEW = 210000;
    public static String userChoice;
    public static int userViewChoice;
    public static String output;

    public static void main(String[] args){
        userChoice = JOptionPane.showInputDialog(null,
                "Please choose a view\n1 - Park view\n2 - Golf course view\n3 - Lake view");
        userViewChoice = Integer.parseInt(userChoice);
        if(userViewChoice == 1)
            output = "Park views condos are $" + PARK_VIEW;
        else
            if(userViewChoice == 2)
                output = "Condos with golf course views are $" + GOLF_VIEW;
            else
                if(userViewChoice == 3)
                    output = "Condos with lake views are $" + LAKE_VIEW;
                else
                    output = "$0";
                JOptionPane.showMessageDialog(null, output);
    }
}
