package exercises._2_04;

class Vehicle {

    private final long id = nextId;
    private double currentSpeed;
    private double currentDirection;
    private String ownerName;

    static long nextId = 1;

    public Vehicle() {
        //id = nextId;  // both will work
        nextId++;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        System.out.println("vehicle1 id: " + vehicle1.id);
        System.out.println("Vehicle nextId: " + Vehicle.nextId);

        Vehicle vehicle2 = new Vehicle();
        System.out.println("\nvehicle2 id: " + vehicle2.id);
        System.out.println("Vehicle nextId: " + Vehicle.nextId);
    }

}
