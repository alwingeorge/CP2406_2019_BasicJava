package Week5.Task4;

public class CountByThrees {
    public static final int BEGIN = 3;
    public static final int END = 300;
    public static final int NUMBER_PER_LINE = 30;

    public static void main(String[] args)
    {
        for(int i = BEGIN; i <= END; i += BEGIN)
        {
            System.out.print(i + " ");
            if(i % NUMBER_PER_LINE == 0)
                System.out.println();
        }
    }
}
