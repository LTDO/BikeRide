package bicycles;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTestThree {

    public void shouldReturnCurrentSpeedTandam() {

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(12, -7);

        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        BikeRideThree bikeRide = new BikeRideThree(mountainBike);
        bikeRide.ride();

        System.out.println("Tandam bike Speed is: " + bikeRide.currentSpeed());

        assertEquals(69, bikeRide.currentSpeed());
    }
}
