package bicycles.models;

import bicycles.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {
    @Test
    public void shouldReturnCurrentSpeedMountainBike() {


        MountainBike mObject = new MountainBike();

        BikeRideOne bikeRide = new BikeRideOne(mObject);

        bikeRide.ride();
        System.out.println("Mountain bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(4, bikeRide.currentSpeed());
    }

}
