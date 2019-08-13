package Week3;
import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter inches: ");

        int inches;
        int feet;
        int inchesleft;

        inches = input.nextInt();

        feet = inches / 12;
        inchesleft = inches % 12;

        System.out.println(inches  + " inches is " + feet + " feet and " + inchesleft + " inches");
    }
}
