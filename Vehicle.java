package lika;

import java.util.ArrayList;
import java.util.List;

public class Vehicle<T extends Human> {

    private final int seats;
    private int busySeats;
    protected List<T> passengers;

    public int getSeats(){
        return this.seats;
    }
    public int getBusySeats(){
        return this.busySeats;
    }

    public Vehicle(int busy, int seats) throws VehicleException{
        if (busy > seats) {
            throw new VehicleException("This vehicle has fewer seats!");
        } else {
            this.seats = seats;
            passengers = new ArrayList<>();
            this.busySeats = busy;
        }
    }

    public void takeASeat(T human) throws VehicleException{
        if (this.busySeats >= this.seats) {
            throw new VehicleException("Last place taken!");
        } else {
            passengers.add(human);
            busySeats++;
        }
    }

    public void freeSeat(T human) throws VehicleException{
        if (!passengers.contains(human)) {
            throw new VehicleException("No such passenger!");
        } else {
            passengers.remove(human);
            busySeats--;
        }
    }
}
