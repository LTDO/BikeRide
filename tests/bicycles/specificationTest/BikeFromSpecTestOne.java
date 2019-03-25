package specificationTest;

import bicycles.models.MountainBike;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTestOne {
    @Test
    public void shouldReturnCurrentSpeedMountainBike() {

        MountainBike tObject = new MountainBike();

        BikeRideOne bikeRide = new BikeRideOne(tObject);

        bikeRide.ride();
        System.out.println("Mountain Speed is: " + bikeRide.currentSpeed());

        assertEquals(38, bikeRide.currentSpeed());
    }

}
