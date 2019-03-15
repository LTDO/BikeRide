package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTest {
    @Test
    public void shouldTestBicycleFromSpec(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -4);

        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);

        bikeRide.ride();
        System.out.println("Mountain bike Speed is: " + bikeRide.currentSpeed());
        assertEquals(2, bikeRide.currentSpeed());
    }

}
