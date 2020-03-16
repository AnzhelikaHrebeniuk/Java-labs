package lika;

public class Bus extends Vehicle {

    protected static int seats = 44;

    public Bus(int busy) throws VehicleException {
        super(busy, seats);
    }

}
