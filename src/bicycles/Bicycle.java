package bicycles;

import bicycles.models.BicycleType;

public interface Bicycle {

    void accelerate();
    void brake();
    int currentSpeed();
    int stop();
    BicycleType bicycles();


}
