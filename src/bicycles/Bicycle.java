package bicycles;

import bicycles.models.BicycleType;

public interface Bicycle {

    public void accelerate();
    public void brake();
    public int currentSpeed();
    public int stop();
    BicycleType bicycles();


}
