package lika;

public class PoliceCar extends Car<Policeman>{

    protected static int seats = 3;

    public PoliceCar(int busy) throws VehicleException {
        super(busy, seats);
    }
}
