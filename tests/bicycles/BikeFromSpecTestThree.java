package bicycles;

import bicycles.models.BicycleType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTestThree {

    public void shouldReturnCurrentSpeedTandam() {

        BicycleSpecification tandamBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandam);

        Bicycle mountainBike = new BicycleFromSpec(tandamBikeSpec);

        BikeRideThree bikeRide = new BikeRideThree(mountainBike);
        bikeRide.ride();

        System.out.println("Tandam bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(69, bikeRide.currentSpeed());
    }
}
