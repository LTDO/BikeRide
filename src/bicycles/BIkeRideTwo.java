package bicycles;

public class BIkeRideTwo implements bicycles.BikeRide {
//
    private final bicycles.Bicycle bicycle;

    public BIkeRideTwo(bicycles.Bicycle bicycle){ this.bicycle = bicycle;}

    @Override
    public void ride() {

        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.stop();
    }

    @Override
    public int currentSpeed() {

        return this.bicycle.currentSpeed();
    }
}


