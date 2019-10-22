package Week8.Task2.Question1;

public class NonFiction extends Book
{
    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 37.99;
    }
}