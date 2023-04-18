package chp2;

public class VehicleV4 extends VehicleV3 {

    public static void main(String[] args) {
        int i = 1;
        for (String arg : args) {
            VehicleV4 vehicle = new VehicleV4();
            vehicle.setOwnerName(arg);
            System.out.println(i++ + ": " + vehicle.getOwnerName());
        }
    }

}
