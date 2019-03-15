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

        BikeRideOne bikeRide = new BikeRideOne(mObject);

        bikeRide.ride();
        System.out.println("Mountain bike Speed: " + bikeRide.currentSpeed());

        assertEquals(11, bikeRide.currentSpeed());
    }

    //RoadBike Test

    @Test
    public void shouldReturnCurrentSpeedRoadBike() {


        RoadBike rObject = new RoadBike();

        BIkeRideTwo bikeRide = new BIkeRideTwo(rObject);

        bikeRide.ride();
        System.out.println("Road bike Speed: " + bikeRide.currentSpeed());

        assertEquals(54, bikeRide.currentSpeed());
    }

  //Tandam Test

    @Test
    public void shouldReturnCurrentSpeedTandam() {


        Tandam tObject = new Tandam();

        BikeRideThree bikeRide = new BikeRideThree(tObject);

        bikeRide.ride();
        System.out.println("Tandam bike Speed: " + bikeRide.currentSpeed());

        assertEquals(117, bikeRide.currentSpeed());
    }

}
