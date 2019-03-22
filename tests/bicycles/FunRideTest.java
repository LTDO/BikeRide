package bicycles;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestFunRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification road_BikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandam);

        Bicycle bicycle1 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandam_BikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(road_BikeSpec);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);

        assertEquals(funRide.getEnteredCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 3);
        assertEquals(funRide.accept(bicycle1), "Accepted");
    }
///*
    @Test
    public void shouldTestFunRide2() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountain_BikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandam);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountain_BikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandam_BikeSpec);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);

        assertEquals(funRide.getEnteredCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
        assertEquals(funRide.accept(bicycle2), "Accepted");

    }
    @Test
    public void shouldTestFunRide3() {

        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        BicycleSpecification mountain_BikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(5, -3, BicycleType.Tandam);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountain_BikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandam_BikeSpec);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);

        assertEquals(funRide.getEnteredCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.Tandam), 3);
        assertEquals(funRide.accept(bicycle3), "Accepted");

    }


}
