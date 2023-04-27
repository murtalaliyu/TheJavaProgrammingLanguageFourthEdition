package chp2;

import chp3.EnergySource;

public class Vehicle implements Cloneable {

    private long id;
    private double currentSpeed;
    private double currentDirection;
    private String ownerName;
    private EnergySource energySource;

    private static long nextId;

    public Vehicle() {}

    public Vehicle(EnergySource energySource) {
        this.energySource = energySource;
    }

    public Vehicle clone() {
        try {
            Vehicle vehicleClone = (Vehicle) super.clone();
            vehicleClone.ownerName = ownerName;
//            vehicleClone.energySource = energySource.clone();
            return vehicleClone;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public long getId() { return id; }
    public double getCurrentSpeed() { return currentSpeed; }
    public void setCurrentSpeed(double newCurrentSpeed) { currentSpeed = newCurrentSpeed; }
    public double getCurrentDirection() { return currentDirection; }
    public void setCurrentDirection(double newCurrentDirection) { currentDirection = newCurrentDirection; }
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String newOwnerName) { ownerName = newOwnerName; }

    public boolean start(EnergySource es) {
        return es.empty();
    }

}
