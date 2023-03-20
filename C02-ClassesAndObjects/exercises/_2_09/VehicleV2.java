package exercises._2_09;

import exercises._2_07.Vehicle;

public class VehicleV2 extends Vehicle {

    protected VehicleV2(String ownerName) {
        this.ownerName = ownerName;
    }

    static long getHighestId() {
        return Vehicle.nextId - 1;
    }

    public static void main(String[] args) {
        VehicleV2 toyota = new VehicleV2("Smith");
        toyota.currentSpeed = 23.3;
        toyota.currentDirection = 65;
        System.out.println("toyota id: " + toyota.id);
        System.out.println("toyota currentSpeed: " + toyota.currentSpeed);
        System.out.println("toyota currentDirection: " + toyota.currentDirection);
        System.out.println("toyota ownerName: " + toyota.ownerName);
        System.out.println("Vehicle nextId: " + Vehicle.nextId);

        VehicleV2 kia = new VehicleV2("Jane");
        kia.currentSpeed = 324;
        kia.currentDirection = 76;
        System.out.println("\nkia id: " + kia.id);
        System.out.println("kia currentSpeed: " + kia.currentSpeed);
        System.out.println("kia currentDirection: " + kia.currentDirection);
        System.out.println("kia ownerName: " + kia.ownerName);
        System.out.println("Vehicle nextId: " + Vehicle.nextId);

        System.out.println("\nHighest ID: " + getHighestId());
    }

}
