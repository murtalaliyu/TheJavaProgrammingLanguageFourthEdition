package chp3;

public abstract class EnergySource implements Cloneable {

    abstract void empty();

    public EnergySource clone() throws CloneNotSupportedException { return (EnergySource) super.clone(); }

}
