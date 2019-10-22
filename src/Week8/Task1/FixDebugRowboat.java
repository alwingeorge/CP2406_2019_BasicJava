package Week8.Task1;

import Week8.Task1.FixDebugBoat;

public class FixDebugRowboat extends FixDebugBoat
{
    public FixDebugRowboat()
    {
        super("row");
        // include setPassengers() and setPower() methods
        // in class constructor
        setPassengers();
        setPower();
    }
    public void setPassengers()
    {
        super.passengers = 2;
    }
    public void setPower()
    {
        super.power = "oars";
    }
}