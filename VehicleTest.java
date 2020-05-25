package lika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    
    @Test
    void fewerSeats(){
        Throwable thrown = assertThrows(VehicleException.class, () -> {
            PoliceCar policeCar = new PoliceCar(14);
        });
        assertNotNull(thrown.getMessage());
    }
}
