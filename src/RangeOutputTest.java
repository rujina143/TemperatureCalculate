import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class RangeOutputTest {
    RangeOutput passengerTemperature1, passengerTemperature2, driverTemperature;
    @BeforeEach
    void setup(){
        passengerTemperature1 = new RangeOutput(65, 95);
        passengerTemperature2 = new RangeOutput(60, 80);
        driverTemperature = new RangeOutput(50, 70);

    }
    @Test
    void getCalculateOfCurrentTemperature1() {
        passengerTemperature1.up();
        passengerTemperature1.up();
        passengerTemperature1.down();
        passengerTemperature1.up();
        assertEquals(82, passengerTemperature1.getCurrentTemperature());

    }
    @Test
    void getCalculateOfCurrentTemperature2() {
        passengerTemperature2.up();
        passengerTemperature2.up();
        passengerTemperature2.down();
        passengerTemperature2.up();
        assertEquals(72, passengerTemperature2.getCurrentTemperature());

    }

    @Test
    void getCalculateOfCurrentTemperature3() {
        driverTemperature.up();
        driverTemperature.up();
        driverTemperature.down();
        driverTemperature.up();
        assertEquals(62, driverTemperature.getCurrentTemperature());

    }
    @Test
    void up() {
    }

    @Test
    void down() {
    }

    @Test
    void getCurrentTemperature() {
    }
}