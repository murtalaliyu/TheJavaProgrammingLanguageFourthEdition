package exercises._2_15;

import exercises._2_13.Vehicle;

public class VehicleV2 extends Vehicle {

    public void changeSpeed(double newSpeed) {
        setCurrentSpeed(newSpeed);
    }

    public void stop() {
        setCurrentSpeed(0);
    }

}
