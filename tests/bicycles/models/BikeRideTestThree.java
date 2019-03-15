package bicycles.models;

import bicycles.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTestThree {
    @Test
    public void shouldReturnCurrentSpeedTandam() {


        Tandam tObject = new Tandam();

        BikeRideOne bikeRide = new BikeRideOne(tObject);

        bikeRide.ride();
        System.out.println("Tandam Speed is: " + bikeRide.currentSpeed());

        assertEquals(38, bikeRide.currentSpeed());
    }

}
