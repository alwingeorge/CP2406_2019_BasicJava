package Week5.Task2;

import java.util.Scanner;

public class AscendingAndDescending {
    public static int num1;
    public static int num2;
    public static int num3;

    public static int low;
    public static int medium;
    public static int high;

    public static void main(String[] args){
        Scanner threeNumbers = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = threeNumbers.nextInt();

        System.out.println("Enter second number: ");
        num2 = threeNumbers.nextInt();

        System.out.println("Enter third number: ");
        num3 = threeNumbers.nextInt();


        //smallest number
        if(num1 <= num2 && num1 <= num3){
            low = num1;
            if(num2 <= num3){
                medium = num2;
                high = num3;
            }
            else {
                if(num2 <= num1 && num2 <= num3){
                    low = num2;
                    if(num1 <= num3){
                        medium = num1;
                        high = num3;
                    }
                    else{
                        medium = num3;
                        high = num1;
                    }
                }
                else{
                    low = num3;
                    if(num1 <= num2){
                        medium = num1;
                        high = num2;
                    }
                    else{
                        medium = num2;
                        high = num1;
                    }
                }
            }
        }

        //Printing ascensiding and descending
        System.out.println("Ascending: " + low + "" + medium + "" + high);
        System.out.print("Descending: " + high + "" + medium + "" + low);
    }
}