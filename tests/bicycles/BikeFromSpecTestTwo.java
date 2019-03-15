package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BikeFromSpecTestTwo {

    @Test
    public void shouldTestBikeFromSpecTwo(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3);

        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BIkeRideTwo bikeRide = new BIkeRideTwo(mountainBike);
        bikeRide.ride();
        System.out.println("Road bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(21, bikeRide.currentSpeed());
    }

}
