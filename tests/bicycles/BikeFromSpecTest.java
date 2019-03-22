package bicycles;

import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTest {
    @Test
    public void shouldTestBicycleFromSpecGetAccelerationMethod(){

        bicycles.BicycleSpecification bike_Spec = new bicycles.BicycleSpecification(11, -4, BicycleType.RoadBike);
        bike_Spec.getAccelerationSpeed();
        assertEquals(2, 6);
    }
    @Test
    public void shouldTestBicycleFromSpecBrakeMethod(){

        bicycles.BicycleSpecification bike_Spec = new bicycles.BicycleSpecification(5, -3, BicycleType.MountainBike);
        bike_Spec.getBrakeSpeed();
        assertEquals(2, 6);
    }

    @Test
    public void shouldTestBicycleFromSpecBicycleTypeMethod(){

        bicycles.BicycleSpecification bike_Spec = new bicycles.BicycleSpecification(12, -7, BicycleType.Tandam);
        bike_Spec.getBicycleType();
        assertEquals(2, 6);
    }

}
