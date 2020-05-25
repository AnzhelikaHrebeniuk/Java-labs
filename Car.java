package lika;

public class Car<T extends Human> extends Vehicle<T> {

    public Car(int busy, int seats) throws VehicleException {
        super(busy, seats);
    }

}

