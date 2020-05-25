package lika;

public class FireCar extends Car<Fireman>{

    protected static int seats = 12;

    public FireCar(int busy) throws VehicleException {
        super(busy, seats);
    }
}

