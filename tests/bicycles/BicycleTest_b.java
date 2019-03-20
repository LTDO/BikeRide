package bicycles;

import bicycles.models.Bicycle_b;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest_b {

    @Test
    public void shouldAccelerate(){

        Bicycle_b bicycle_b = new Bicycle_b();

        bicycle_b.accelerate();
        assertEquals(1,5);
    }
    @Test
    public void currentSpeed_B(){
        Bicycle_b bicycle_b = new Bicycle_b();

        bicycle_b.currentSpeed();
        assertEquals(1,2);
    }
    @Test
    public void shouldTestBrake(){
        Bicycle_b bicycle_b = new Bicycle_b();

        bicycle_b.brake();
        assertEquals(1,2);
    }

    @Test
    public void shouldStop(){
        Bicycle_b bicycle_b = new Bicycle_b();

        bicycle_b.stop();
        assertEquals(1,2);
    }
}
