package bicycles.models;

public class Bicycle_b {
    int speed;
    public void accelerate(){
        speed += 5;
    }
    public void brake(){
        speed -= 3;
    }
    public int currentSpeed(){
        return speed;
    }
    public int stop(){
        return speed = 0;
    }
}
