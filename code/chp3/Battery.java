package chp3;

public class Battery implements EnergySource {
    @Override
    public boolean empty() {
        System.out.println("Enter Battery::empty");
        return false;
    }
}
