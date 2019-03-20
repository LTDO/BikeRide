package bicycles;

import bicycles.models.BicycleType;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed){

        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }
    public int getAccelerationSpeed() {
        return accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }
    public BicycleType getBicycleType(){
        return bicycleType;
    }

}
