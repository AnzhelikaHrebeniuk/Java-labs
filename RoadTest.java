package lika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    private static FireCar fireCar;
    private static PoliceCar policeCar;
    private static Taxi taxi;
    private static Bus bus;

    private static Human girl;
    private static Human boy;
    private static Fireman fireman1;
    private static Fireman fireman2;
    private static Fireman fireman3;
    private static Policeman policeman1;
    private static Policeman policeman2;

    @BeforeEach
    void setUp() throws VehicleException {
        fireCar = new FireCar(0);
        policeCar = new PoliceCar(0);
        taxi = new Taxi(0);
        bus = new Bus(0);

        girl = new Human();
        boy = new Human();
        fireman1 = new Fireman();
        fireman2 = new Fireman();
        fireman3 = new Fireman();
        policeman1 = new Policeman();
        policeman2 = new Policeman();
    }

    @Test
    void getCountOfHumans() throws VehicleException {
        Road road = new Road();
        road.addCarToRoad(fireCar);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(bus);
        road.addCarToRoad(taxi);

        assertEquals(road.getCountOfHumans(), 0);

        fireCar.takeASeat(fireman1);
        bus.takeASeat(fireman2);
        bus.takeASeat(girl);
        taxi.takeASeat(boy);

        assertEquals(road.getCountOfHumans(), 4);

        policeCar.takeASeat(policeman1);
        taxi.takeASeat(policeman2);
        fireCar.takeASeat(fireman3);

        assertEquals(road.getCountOfHumans(), 7);
    }

}
