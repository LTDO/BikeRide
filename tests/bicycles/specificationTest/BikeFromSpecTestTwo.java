package specificationTest;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.BIkeRideTwo;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BikeFromSpecTestTwo {

    @Test
    public void shouldTestBikeFromSpecTwo(){

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.RoadBike);

        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BIkeRideTwo bikeRide = new BIkeRideTwo(mountainBike);
        bikeRide.ride();
        System.out.println("Road bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(21, bikeRide.currentSpeed());
    }

}
