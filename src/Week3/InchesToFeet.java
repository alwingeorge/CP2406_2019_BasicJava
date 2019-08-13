package Week3;

public class InchesToFeet {
    public static void main(String[] args) {
        final int INCHES_IN_FOOT = 12;
        int inches = 86;
        int feet;
        int inchesleft;
        feet = inches / INCHES_IN_FOOT;
        inchesleft = inches % INCHES_IN_FOOT;
        System.out.println(inches  + " inches is " + feet + " feet and " + inchesleft + " inches");
    }
}
