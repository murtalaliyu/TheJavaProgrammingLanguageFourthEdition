package old;

public class VehicleV3 extends VehicleV2 {

    public VehicleV3(String ownerName) {
        super(ownerName);
    }

    public String toString() {
        return "Vehicle " + id + " has owner " + ownerName
                + " is current speeding at " + currentSpeed
                + " in " + currentDirection + " direction";
    }

    public static void main(String[] args) {
        VehicleV3 bmw = new VehicleV3("Bill");
        bmw.currentSpeed = 45;
        bmw.currentDirection = 3;
        System.out.println(bmw.toString());
    }
}
