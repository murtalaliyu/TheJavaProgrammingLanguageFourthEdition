package chp3;

public class Battery extends EnergySource {
    @Override
    public boolean empty() {
        System.out.println("Enter Battery::empty");
        return false;
    }
}
