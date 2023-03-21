package exercises._2_17;

import exercises._2_15.VehicleV2;

public class VehicleV3 extends VehicleV2 {

    public void turn(double degrees) {}

    public void turn(Direction direction) {}

}

enum Direction {
    TURN_LEFT,
    TURN_RIGHT
}
