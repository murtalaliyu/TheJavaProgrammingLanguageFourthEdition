package chp3;

public class Battery extends EnergySource {

    @Override
    protected void empty() {
        System.out.println("empty() in Battery");
    }
}
