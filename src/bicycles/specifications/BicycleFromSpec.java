package bicycles.specifications;

import bicycles.models.BicycleBase;
import bicycles.models.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    private final BicycleSpecification bikeSpec;

    public BicycleFromSpec(BicycleSpecification bikeSpec){

         this.bikeSpec = bikeSpec;

    }

    @Override
    public void accelerate() {

//        this.bikeSpec.getAccelerationSpeed();
        changeSpeed(this.bikeSpec.getAccelerationSpeed());

    }

    @Override
    public void brake() {

//        this.bikeSpec.getBrakeSpeed();
        changeSpeed(this.bikeSpec.getBrakeSpeed());

    }

    @Override
    public BicycleType bicycles() {
        return this.bikeSpec.getBicycleType();
    }
}
