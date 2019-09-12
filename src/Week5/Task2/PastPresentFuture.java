package Week5.Task2;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    private static int mo, da, yr;
    private static int todayMo, todayDa, todayYr;

    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        Scanner input = new Scanner(System.in);
        todayMo = today.getMonthValue();
        todayDa = today.getDayOfMonth();
        todayYr = today.getYear();

        System.out.print("Enter a month >>> ");
        mo = input.nextInt();
        System.out.print("Enter a day >>> ");
        da = input.nextInt();
        System.out.print("Enter a year in four digit >>> ");
        yr = input.nextInt();

        if(yr != todayYr)
            System.out.println(yr + " is not this year");
        else
            if(mo < todayMo)
                System.out.println(mo + " was a month early this year");
            else
                if(mo > todayMo)
                    System.out.println(mo + " is a month later this year");
                else
                    System.out.println(mo + " is this month");
    }
}
