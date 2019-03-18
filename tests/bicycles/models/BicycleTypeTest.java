package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTypeTest {
@Test
    public void shouldTestBicycleType(){
    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.MountainBike);
    Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
    BikeRideOne bikeRide = new BikeRideOne(bicycle);
    bikeRide.ride();
    System.out.println("******Mountain Bike Specification******");
    System.out.println();
    System.out.println("Mountain Speed: " + bikeRide.currentSpeed() +
                       "\nMountain Bike Acceleration: " + roadBikeSpec.getAccelerationSpeed() +
                       "\nMountain Bike Brake Speed: " + roadBikeSpec.getBrakeSpeed());
    assertEquals(14, bikeRide.currentSpeed());
    assertEquals(11, roadBikeSpec.getAccelerationSpeed());
    assertEquals("MountainBike", roadBikeSpec.getBicycleType().MountainBike.toString());
    assertEquals(-4, roadBikeSpec.getBrakeSpeed());
}
@Test
    public void shouldTestBicycleTypeRoadBike(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

         System.out.println("******Road Bike Specification******");
         System.out.println();

         System.out.println("Roadbike Speed: " + bikeRide.currentSpeed() +
                "\nRoadBike Acceleration: " + roadBikeSpec.getAccelerationSpeed() +
                "\nRoadBike Brake Speed: " + roadBikeSpec.getBrakeSpeed());
        assertEquals(4, bikeRide.currentSpeed());
        assertEquals(5, roadBikeSpec.getAccelerationSpeed());
        assertEquals("Roadbike", roadBikeSpec.getBicycleType().RoadBike.toString());
        assertEquals(-4, roadBikeSpec.getBrakeSpeed());
    }

    @Test
    public void shouldTestBicycleTypeTandam(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.Tandam);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        System.out.println("******Tandam Specification******");
        System.out.println();
        System.out.println("Tandam Speed: " + bikeRide.currentSpeed() +
                "\nTandam Acceleration: " + roadBikeSpec.getAccelerationSpeed() +
                "\nTandam Brake Speed: " + roadBikeSpec.getBrakeSpeed());
        assertEquals(4, bikeRide.currentSpeed());
        assertEquals(5, roadBikeSpec.getAccelerationSpeed());
        assertEquals("Tandam", roadBikeSpec.getBicycleType().Tandam.toString());
        assertEquals(-3, roadBikeSpec.getBrakeSpeed());
    }

}
