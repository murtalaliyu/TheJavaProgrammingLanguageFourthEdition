package chp3;

public class GasTank extends EnergySource {
    @Override
    public boolean empty() {
        System.out.println("Enter GasTank::empty");
        return false;
    }
}
