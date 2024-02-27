package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void carInstanceIsAlsoVehicle() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void carCreatedWithFourWheels() {
        Car car = new Car("Toyota", "Camry", 2021);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleCreatedWithTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carReachesSpeedOf60() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleReachesSpeedOf75() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carStopsWhenParked() {
        Car car = new Car("Toyota", "Camry", 2021);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}