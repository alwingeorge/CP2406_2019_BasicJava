package Week5.Task1;

// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class DebugFive3
{
    public static int item;
    public static String output;
    public static final int LOW = 111;
    public static final int HIGH = 999;
    public static final int CUTOFF = 500;


    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter item number");
        item = input.nextInt();
        if(item <= LOW)
            output = "Item number too low";
        else
        if(item > HIGH)
            output = "Item number too high";
        else
        if(item < CUTOFF)
            output = "Valid - in Automotive Department";
        else
            output = "Valid - Item in Housewares Department";
        System.out.println(output);
    }
}