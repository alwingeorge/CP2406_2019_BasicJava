package Week7.Task1;

import Week7.Task1.DebugCustomerMakingPurchase;

public class DebugTen4 {
    public static int id = 12241;
    public static String name = "Franklin";
    public static double credit = 1000.00;
    public static double purchase = 1325.77;

    public static void main(String[] args)
    {

        DebugCustomerMakingPurchase cust = new DebugCustomerMakingPurchase(id, name, credit, purchase);
        cust.display();
    }
}
