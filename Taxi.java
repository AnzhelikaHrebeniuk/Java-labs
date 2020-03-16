package lika;

public class Taxi extends Car{

    protected static int seats = 5;

    public Taxi(int busy) throws VehicleException {
        super(busy, seats);
    }
}
