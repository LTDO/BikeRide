package bicycles.models;

public interface Bicycle {

    void accelerate();
    void brake();
    int currentSpeed();
    int stop();
    BicycleType bicycles();


}
