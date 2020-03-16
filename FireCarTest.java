package lika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireCarTest {

    private static FireCar fireCar;
    private static Fireman fireman1;
    private static Fireman fireman2;


    @BeforeEach
    void setUp() throws VehicleException {
        fireCar = new FireCar(11);
        fireman1 = new Fireman();
        fireman2 = new Fireman();
    }

    @Test
    void takeASeat() throws VehicleException {
        assertEquals(fireCar.getBusySeats(), 11);
        fireCar.takeASeat(fireman1);
        Throwable thrown = assertThrows(VehicleException.class, () -> {
            fireCar.takeASeat(fireman2);
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void freeSeat() throws VehicleException {
        fireCar.takeASeat(fireman2);
        assertEquals(fireCar.getBusySeats(), 12);
        fireCar.freeSeat(fireman2);
        assertEquals(fireCar.getBusySeats(), 11);
        Throwable thrown = assertThrows(VehicleException.class, () -> {
            fireCar.freeSeat(fireman2);
        });
        assertNotNull(thrown.getMessage());
    }
}