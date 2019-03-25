package bicycles.rides;

import bicycles.models.Bicycle;

public class BikeRideThree implements BikeRide {

    private final Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){ this.bicycle = bicycle;}

    @Override
    public void ride() {

        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
    }

    @Override
    public int currentSpeed() {

        return this.bicycle.currentSpeed();
    }
}

