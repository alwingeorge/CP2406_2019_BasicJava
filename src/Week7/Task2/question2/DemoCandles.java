package Week7.Task2.question2;

import static org.junit.jupiter.api.Assertions.*;

class DemoCandles {
    public static void main(String args[])
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        aCandle.setColor("pink");
        aCandle.setHeight(6);
        aScentedCandle.setColor("white");
        aScentedCandle.setScent("gardinia");
        aScentedCandle.setHeight(6);
        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() +
                " candle costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " +
                aScentedCandle.getScent() +
                " " + aScentedCandle.getColor() +
                " candle costs $" + aScentedCandle.getPrice());
    }

}