package Week5.Task4;

public class Factorials {
    public static final int MAX = 10;
    public static int factorial;

    public static void main(String[] args)
    {
        for(int i = 1; i <= MAX; i ++)
        {
            factorial = i;
            for(int j =i - 1; j > 0; --j)
                factorial = factorial * j;
            System.out.println("The factorial of " + i + " is" + factorial);
        }
    }
}
