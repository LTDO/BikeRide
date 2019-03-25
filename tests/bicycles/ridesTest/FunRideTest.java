package ridesTest;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;
import bicycles.rides.FunRide;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestFunRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification road_BikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandam);

        Bicycle bicycle1 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandam_BikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(road_BikeSpec);

        FunRide funRide = new FunRide(4);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle3);

        assertEquals(funRide.getEnteredCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 4);
        assertEquals(funRide.accept(bicycle1), "Accepted");
    }
    @Test
    public void shouldTestGetCountForType(){
        FunRide funRide = new FunRide(3);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);

        Bicycle bicycle1 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandam_BikeSpec);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);

        assertEquals(funRide.getEnteredCount(), 2);

    }

    @Test
    public void shouldTestGetEnteredCount(){
        FunRide funRide = new FunRide(4);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);

        Bicycle bicycle1 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandam_BikeSpec);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);

        assertEquals(funRide.getEnteredCount(), 2);

    }

    @Test
    public void shouldTestGetAccept(){
        FunRide funRide = new FunRide(4);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandam_BikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);

        Bicycle bicycle1 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(tandam_BikeSpec);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);

        assertEquals(funRide.accept(bicycle1), "Accepted");

    }

}
