package exercises._2_13;

public class Vehicle {

    private long id;
    private double currentSpeed;
    private double currentDirection;
    private String ownerName;

    private static long nextId;

    public long getId() { return id; }
    public double getCurrentSpeed() { return currentSpeed; }
    public void setCurrentSpeed(double newCurrentSpeed) { currentSpeed = newCurrentSpeed; }
    public double getCurrentDirection() { return currentDirection; }
    public void setCurrentDirection(double newCurrentDirection) { currentDirection = newCurrentDirection; }
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String newOwnerName) { ownerName = newOwnerName; }

}
