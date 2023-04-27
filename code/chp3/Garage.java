package chp3;

import chp2.Vehicle;

class Garage extends Vehicle implements Cloneable {

    private Vehicle[] vehicles;

    public Garage(int capacity) {
        this.vehicles = new Vehicle[capacity];
    }

    public Garage clone() {
        Garage garageClone = (Garage) super.clone();
        Vehicle[] vehiclesClone = new Vehicle[vehicles.length];
        for (int i = 0; i < vehicles.length; i++) {
            vehiclesClone[i] = vehicles[i].clone();
        }
        garageClone.vehicles = vehiclesClone;
        return garageClone;
    }

    public static void main(String[] args) {
        Garage firstGarage = new Garage(2);

        Vehicle firstVehicle = new Vehicle();
        firstVehicle.setOwnerName("Mike");
        firstGarage.vehicles[0] = firstVehicle;

        // -------------------------------------
        Vehicle secondVehicle = new Vehicle();
        secondVehicle.setOwnerName("Jake");
        firstGarage.vehicles[1] = secondVehicle;

        // ---------------------------------------------

        Garage secondGarage = firstGarage.clone();

        // ---------------------------------------------

        firstGarage.vehicles[0].setOwnerName("Ollie");

        // ---------------------------------------------

        System.out.println("First Garage First Vehicle Owner: "
        + firstGarage.vehicles[0].getOwnerName());

        System.out.println("Second Garage First Vehicle Owner: "
        + secondGarage.vehicles[0].getOwnerName());
    }

}
