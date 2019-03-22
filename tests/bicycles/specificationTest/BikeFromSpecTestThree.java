package specificationTest;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.BikeRideThree;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTestThree {

    @Test
    public void shouldReturnCurrentSpeedTandam() {

        BicycleSpecification tandamBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandam);

        Bicycle tandamBike = new BicycleFromSpec(tandamBikeSpec);

        BikeRideThree bikeRide = new BikeRideThree(tandamBike);
        bikeRide.ride();

        System.out.println("Tandam bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(69, bikeRide.currentSpeed());
    }
}
