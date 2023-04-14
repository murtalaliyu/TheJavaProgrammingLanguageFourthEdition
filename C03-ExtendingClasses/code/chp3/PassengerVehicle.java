import exercises._2_18.VehicleV4;

/**
 * Exercise 3.1
 */
public class PassengerVehicle extends VehicleV4 {

    private int numberOfSeats;
    private int numberCurrentlyOccupied;

    public int getNumberOfSeats() { return numberOfSeats; }
    public final void setNumberOfSeats(int numberOfSeats) { this.numberOfSeats = numberOfSeats; }
    public int getNumberCurrentlyOccupied() { return numberCurrentlyOccupied; }
    public void setNumberCurrentlyOccupied(int numberCurrentlyOccupied) { this.numberCurrentlyOccupied = numberCurrentlyOccupied; }

    public String toString() {
        return "Owner Name: " + getOwnerName()
                + "\n" + "Current Speed: " + getCurrentSpeed()
                + "\n" + "Current Direction: " + getCurrentDirection()
                + "\n" + "Number of Seats: " + getNumberOfSeats()
                + "\n" + "Number Currently Occupied: " + getNumberCurrentlyOccupied();
    }

    public static void main(String[] args) {
        PassengerVehicle vehicle = new PassengerVehicle();
        vehicle.setOwnerName("Mike");
        vehicle.setCurrentDirection(9);
        vehicle.setCurrentSpeed(56);
        vehicle.setNumberOfSeats(7);
        vehicle.setNumberCurrentlyOccupied(4);

        System.out.println(vehicle);
    }

}
