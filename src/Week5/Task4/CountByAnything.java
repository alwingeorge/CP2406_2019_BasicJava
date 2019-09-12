package Week5.Task4;

import java.util.Scanner;

public class CountByAnything {
    public static final int END = 200;
    public static int NUMBER_PER_LINE;

    public static void main (String[] args)
    {


        Scanner keyboard = new Scanner(System.in);
        int stepValue;
        System.out.print("Enter number to count by >> ");
        stepValue = keyboard.nextInt();
        NUMBER_PER_LINE = stepValue * 10;

        for(int i = stepValue; i <= END; i += stepValue)
        {
            System.out.print(i + "  ");
            if(i % NUMBER_PER_LINE == 0)
                System.out.println();
        }
    }
}
