package Week5.Task2;

import javax.swing.*;
import java.util.Scanner;

public class CondosSales2 {
    private static final int PARK_VIEW = 150000;
    private static final int GOLF_VIEW = 170000;
    private static final int LAKE_VIEW = 210000;
    private static final int PARKING = 5000;
    private static int userChoice;

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1 - Park views");
        System.out.println("2 - Golf course view");
        System.out.println("3 - Lake view");
        System.out.println("Enter your choice >>> ");
        userChoice = choice.nextInt();

        if (userChoice == 1) {
            System.out.println("Park view condos");
            System.out.println("Do you want to have a Parking\n1 - Yes\n2 - No");
            System.out.println("Enter choice >>> ");
            userChoice = choice.nextInt();

            if (userChoice == 1)
                System.out.println("Lake view condos with Parking is $" + (PARK_VIEW + PARKING));
            else
                if(userChoice == 2)
                    System.out.println("Parking views condos without parking $" + PARK_VIEW);

                else
                    System.out.println("Invalid choice");
        }
        else
            if(userChoice == 2){
                System.out.println("Golf course view condos");
                System.out.println("Do you want to have a Parking\n1 - Yes\n2 - No");
                System.out.println("Enter choice >>> ");
                userChoice = choice.nextInt();

                if(userChoice == 1)
                    System.out.println("Golf course view condos with parking is $" + (GOLF_VIEW + PARKING));
                else
                    if(userChoice == 2)
                        System.out.println("Golf course view condos without parking is $" + GOLF_VIEW);
                    else
                        System.out.println("Invalid choice");

            }
            else
                if(userChoice == 3) {
                    System.out.println("Lake view condos");
                    System.out.println("Do you want to have a Parking\n1 - Yes\n2 - No");
                    System.out.println("Enter choice >>> ");
                    userChoice = choice.nextInt();

                    if (userChoice == 1)
                        System.out.println("Lake view condos with Parking is $" + (LAKE_VIEW + PARKING));
                    else
                        if(userChoice == 2)
                            System.out.println("Lake views condos without parking $" + LAKE_VIEW);
                        else
                            System.out.println("Invalid choice");
                }
                else
                    System.out.println("Invalid choice");

    }

}
