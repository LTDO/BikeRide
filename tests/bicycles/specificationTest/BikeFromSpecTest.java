package specificationTest;

import bicycles.models.BicycleType;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTest {
    @Test
    public void shouldTestBicycleSpecificationsForRoadBike(){

        BicycleSpecification bike_Spec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        System.out.println( "\nBike type: " + bike_Spec.getBicycleType() +
                            "\nAcceleration Speed: " + bike_Spec.getAccelerationSpeed() +
                            "\nBrake Speed: " + bike_Spec.getBrakeSpeed());

        assertEquals(11, bike_Spec.getAccelerationSpeed());
        assertEquals(-4, bike_Spec.getBrakeSpeed());
        assertEquals(bike_Spec.getBicycleType().toString(), "RoadBike");
    }
    @Test
    public void shouldTestBicycleSpecificationsForMountainBike(){

        BicycleSpecification bike_Spec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        System.out.println( "\nBike type: " + bike_Spec.getBicycleType() +
                            "\nAcceleration Speed: " + bike_Spec.getAccelerationSpeed() +
                            "\nBrake Speed: " + bike_Spec.getBrakeSpeed());

        assertEquals(5, bike_Spec.getAccelerationSpeed());
        assertEquals(-3, bike_Spec.getBrakeSpeed());
        assertEquals(bike_Spec.getBicycleType().toString(),"MountainBike");
    }

    @Test
    public void shouldTestBicycleSpecificationsForTandamBike(){

        BicycleSpecification bike_Spec = new BicycleSpecification(12, -7, BicycleType.Tandam);
        System.out.println( "\nBike type: " + bike_Spec.getBicycleType() +
                            "\nAcceleration Speed: " + bike_Spec.getAccelerationSpeed() +
                            "\nBrake Speed: " + bike_Spec.getBrakeSpeed());

        assertEquals(12, bike_Spec.getAccelerationSpeed());
        assertEquals(-7, bike_Spec.getBrakeSpeed());
        assertEquals(bike_Spec.getBicycleType().toString(),"Tandam");

    }

}
