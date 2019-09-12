package Week5.Task2;

import java.util.Scanner;

public class EvenOdd {
    public static int number;
    public static boolean result;



    public static boolean isEven(int number){
        if (number % 2 == 0)
            result = true;
        else{
            result = false;
        }

        return result;
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (isEven(number))
            System.out.print(number + " is even");
        else
            System.out.print(number + " is odd");
    }
}
