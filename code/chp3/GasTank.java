package chp3;

public class GasTank extends EnergySource {
    @Override
    protected void empty() {
        System.out.println("empty() in GasTank");
    }
}
