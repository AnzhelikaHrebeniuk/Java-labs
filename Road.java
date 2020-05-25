package lika;

import java.util.ArrayList;
import java.util.List;

public class Road {

    public List<Vehicle> carsInRoad = new ArrayList<>();

    public int getCountOfHumans(){
        int result = 0;
        for (Vehicle vehicle: carsInRoad){
            result += vehicle.getBusySeats();
        }
        return result;
    };

    public void addCarToRoad(Vehicle vehicle){
        carsInRoad.add(vehicle);
    };

    }
