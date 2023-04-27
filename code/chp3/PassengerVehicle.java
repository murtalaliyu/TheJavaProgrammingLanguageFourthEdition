package chp3;

import chp2.Vehicle;
import chp2.VehicleV4;

public class PassengerVehicle extends VehicleV4 implements Cloneable {

    private int numberOfSeats;
    private int numberCurrentlyOccupied;

    public int getNumberOfSeats() { return numberOfSeats; }
    public final void setNumberOfSeats(int numberOfSeats) { this.numberOfSeats = numberOfSeats; }
    public int getNumberCurrentlyOccupied() { return numberCurrentlyOccupied; }
    public void setNumberCurrentlyOccupied(int numberCurrentlyOccupied) { this.numberCurrentlyOccupied = numberCurrentlyOccupied; }

    public PassengerVehicle clone() {
        return (PassengerVehicle) super.clone();
    }

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

        PassengerVehicle v = new PassengerVehicle();
        Battery battery = new Battery();
        boolean batteryIsEmpty = v.start(battery);
        System.out.println("Battery is empty: " + batteryIsEmpty);

        GasTank gasTank = new GasTank();
        boolean gasTankIsEmpty = v.start(gasTank);
        System.out.println("Gas Tank is empty: " + gasTankIsEmpty);
    }

}
