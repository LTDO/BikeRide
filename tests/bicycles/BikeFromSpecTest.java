package bicycles;

import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeFromSpecTest {
    @Test
    public void shouldTestBicycleFromSpecGetAccelerationMethod(){

        BicycleSpecification bike_Spec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        bike_Spec.getAccelerationSpeed();
        assertEquals(2, 6);
    }
    @Test
    public void shouldTestBicycleFromSpecBrakeMethod(){

        BicycleSpecification bike_Spec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        bike_Spec.getBrakeSpeed();
        assertEquals(2, 6);
    }

    @Test
    public void shouldTestBicycleFromSpecBicycleTypeMethod(){

        BicycleSpecification bike_Spec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        bike_Spec.getBicycleType();
        assertEquals(2, 6);
    }

}
