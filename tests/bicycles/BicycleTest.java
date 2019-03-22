package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest{

    //MountainBike Test
    @Test
    public void shouldReturnCurrentSpeedMountainBike() {
        MountainBike mObject = new MountainBike();
        System.out.println("Mountain bike Speed: " + mObject.currentSpeed());
        assertEquals(11, mObject.currentSpeed());
    }

    //RoadBike Test
    @Test
    public void shouldReturnCurrentSpeedRoadBike() {

        RoadBike rObject = new RoadBike();
        System.out.println("Road bike Speed: " + rObject.currentSpeed());
        assertEquals(54, rObject.currentSpeed());
    }

  //Tandam Test
    @Test
    public void shouldReturnCurrentSpeedTandam() {
        Tandam tandam = new Tandam();
        System.out.println("Tandam bike Speed: " + tandam.currentSpeed());
        assertEquals(117, tandam.currentSpeed());
    }

}
