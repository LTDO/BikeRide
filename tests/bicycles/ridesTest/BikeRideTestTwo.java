package ridesTest;

import bicycles.models.RoadBike;
import bicycles.rides.BIkeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTestTwo {
    @Test
    public void shouldReturnCurrentSpeedRoadBike() {

        RoadBike rObject = new RoadBike();

        BIkeRideTwo bikeRide = new BIkeRideTwo(rObject);

        bikeRide.ride();
        System.out.println("Road bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(54, bikeRide.currentSpeed());
    }

}
