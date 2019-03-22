package specificationTest;

import bicycles.models.BicycleType;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTest {
    @Test
    public void shouldTestBicycleFromSpecGetAccelerationMethod(){

        BicycleSpecification bike_Spec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        bike_Spec.getAccelerationSpeed();
        assertEquals(2, 6);
    }
    @Test
    public void shouldTestBicycleFromSpecBrakeMethod(){

        BicycleSpecification bike_Spec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        bike_Spec.getBrakeSpeed();
        assertEquals(2, 6);
    }

    @Test
    public void shouldTestBicycleFromSpecBicycleTypeMethod(){

        BicycleSpecification bike_Spec = new BicycleSpecification(12, -7, BicycleType.Tandam);
        bike_Spec.getBicycleType();
        assertEquals(2, 6);
    }

}
