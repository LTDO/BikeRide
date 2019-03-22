package bicycles.models;

public abstract class BicycleBase implements Bicycle {

    protected int speed;

    protected void changeSpeed(int x){

         speed += x;
    }

    public int stop(){

        return 0;
    }

    public int currentSpeed(){

        return speed;
    }


}
