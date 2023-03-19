package exercises._2_07;

class Vehicle {

    private final long id = nextId++;
    private double currentSpeed;
    private double currentDirection;
    private String ownerName;

    static long nextId = 1;
    
    Vehicle() {}
    
    Vehicle(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public static void main(String[] args) {
        Vehicle toyota = new Vehicle("Smith");
        toyota.currentSpeed = 23.3;
        toyota.currentDirection = 65;
        System.out.println("toyota id: " + toyota.id);
        System.out.println("toyota currentSpeed: " + toyota.currentSpeed);
        System.out.println("toyota currentDirection: " + toyota.currentDirection);
        System.out.println("toyota ownerName: " + toyota.ownerName);
        System.out.println("Vehicle nextId: " + Vehicle.nextId);

        Vehicle kia = new Vehicle("Jane");
        kia.currentSpeed = 324;
        kia.currentDirection = 76;
        System.out.println("\nkia id: " + kia.id);
        System.out.println("kia currentSpeed: " + kia.currentSpeed);
        System.out.println("kia currentDirection: " + kia.currentDirection);
        System.out.println("kia ownerName: " + kia.ownerName);
        System.out.println("Vehicle nextId: " + Vehicle.nextId);
    }

}
