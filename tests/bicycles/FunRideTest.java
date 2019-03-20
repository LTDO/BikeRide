package bicycles;

import bicycles.models.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestFunRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(11, -4, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(3);

        MountainBike bicycle1  = new MountainBike();
        RoadBike bicycle2 = new RoadBike();
        Tandam bicycle3 = new Tandam();

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);

        assertEquals(funRide.getEntertedCount(), 4);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 4);
        assertEquals(funRide.accept(bicycle), "Rejected");
    }
/*
    @Test
    public void shouldTestFunRide2() {
        BicycleSpecification roadbikeBikeSpec = new BicycleSpecification(5, -3, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadbikeBikeSpec);
        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);

        assertEquals(funRide.getEntertedCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
//        assertEquals(funRide.accept(), "Rejected");
    }

    @Test
    public void shouldTestFunRide3(){
        BicycleSpecification tandamBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandam);
        Bicycle bicycle = new BicycleFromSpec(tandamBikeSpec);
        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);

        assertEquals(funRide.getEntertedCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.Tandam), 3);
        assertEquals(funRide.accept(bicycle), "Rejected");
}
*/
}
