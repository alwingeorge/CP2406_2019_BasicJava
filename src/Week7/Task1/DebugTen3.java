package Week7.Task1;

import Week7.Task1.DebugPhoneBook;

import javax.swing.*;

public class DebugTen3 {
    public static String area, inStr;
    public static int pages;

    public static void main(String[] args)
    {

        area = JOptionPane.showInputDialog(null,"Enter city for phone book");
        inStr = JOptionPane.showInputDialog(null,"Enter number of pages in " + area + "'s phone book");
        pages = Integer.parseInt(inStr);
        DebugPhoneBook pb = new DebugPhoneBook(pages, area);
        pb.display();
    }
}
