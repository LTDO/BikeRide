package bicycles;

import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestFunRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(11, -4, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
//        funRide.accept(bicycle);

        assertEquals(funRide.getEntertedCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 3);
//        assertEquals(funRide.accept(Bicycle bicycle), 3 );
//        assertEquals(funRide.getCountForType(), 3)
    }

    @Test
    public void shouldTestFunRide2() {
        BicycleSpecification roadbikeBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadbikeBikeSpec);
        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
//        funRide.accept(bicycle);

        assertEquals(funRide.getEntertedCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);
//        assertEquals(funRide.accept(), 3);
    }

    @Test
    public void shouldTestFunRide3(){
        BicycleSpecification tandamBikeSpec = new BicycleSpecification(11, -4, BicycleType.Tandam);
        Bicycle bicycle = new BicycleFromSpec(tandamBikeSpec);
        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle);
        funRide.accept(bicycle);
        funRide.accept(bicycle);

        assertEquals(funRide.getEntertedCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.Tandam), 3);
}
}
