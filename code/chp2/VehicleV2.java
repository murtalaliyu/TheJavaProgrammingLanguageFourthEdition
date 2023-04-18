package chp2;

public class VehicleV2 extends Vehicle {

    public void changeSpeed(double newSpeed) {
        setCurrentSpeed(newSpeed);
    }

    public void stop() {
        setCurrentSpeed(0);
    }

}
