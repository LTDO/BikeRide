package specificationTest;

import bicycles.models.BicycleType;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTest {
    @Test
    public void shouldTestBicycleSpecificationsForRoadBike(){

        BicycleSpecification bike_Spec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        System.out.println( "Bike Type" + bike_Spec.getBicycleType() +
                            "Acceleration Speed: " + bike_Spec.getAccelerationSpeed() +
                            "Brake Speed: " + bike_Spec.getBrakeSpeed());

        assertEquals(2, bike_Spec.getAccelerationSpeed());
        assertEquals(2, bike_Spec.getBrakeSpeed());
        assertEquals(bike_Spec.getBicycleType(), "Road Bike", toString());
    }
    @Test
    public void shouldTestBicycleSpecificationsForMountainBike(){

        BicycleSpecification bike_Spec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        System.out.println( "Bike Type" + bike_Spec.getBicycleType() +
                            "Acceleration Speed: " + bike_Spec.getAccelerationSpeed() +
                            "Brake Speed: " + bike_Spec.getBrakeSpeed());

        assertEquals(2, bike_Spec.getAccelerationSpeed());
        assertEquals(2, bike_Spec.getBrakeSpeed());
        assertEquals(bike_Spec.getBicycleType(), "Mountain Bike", toString());
    }

    @Test
    public void shouldTestBicycleSpecificationsForTandamBike(){

        BicycleSpecification bike_Spec = new BicycleSpecification(12, -7, BicycleType.Tandam);
        System.out.println( "Bike Type" + bike_Spec.getBicycleType() +
                            "Acceleration Speed: " + bike_Spec.getAccelerationSpeed() +
                            "Brake Speed: " + bike_Spec.getBrakeSpeed());

        assertEquals(2, bike_Spec.getAccelerationSpeed());
        assertEquals(2, bike_Spec.getBrakeSpeed());
        assertEquals(bike_Spec.getBicycleType(),"Tandam", toString());

    }

}
