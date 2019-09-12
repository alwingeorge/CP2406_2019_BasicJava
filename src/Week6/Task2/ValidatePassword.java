package Week6.Task2;

import java.util.Scanner;

public class ValidatePassword {
    public static String aString;
    public static int stringLength;
    public static final int NUM = 2;
    public static int upperCount = 0;
    public static int lowerCount = 0;
    public static int digitCount = 0;
//    public static int numSpaces = 0;
//    public static int letterCount = 0;


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string >> ");
        aString = in.nextLine();
        stringLength = aString.length();

        for(int i = 0; i < stringLength; i++)
        {
            char ch = aString.charAt(i);
            if(Character.isUpperCase(ch))
                upperCount++;
            else
            if(Character.isLowerCase(ch))
                lowerCount++;
            else
            if(Character.isDigit(ch))
                digitCount++;
        }
        if(upperCount >= NUM && lowerCount >= NUM && digitCount >= NUM)
            System.out.println("Valid password");
        else
        {
            System.out.println("The password did not have enough of the following:");
            if(upperCount < NUM)
                System.out.println("uppercase letters");
            if(lowerCount < NUM)
                System.out.println("lowercase letters");
            if(digitCount < NUM)
                System.out.println("digits");
        }
    }
}
