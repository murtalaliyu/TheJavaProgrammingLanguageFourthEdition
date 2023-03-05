package exercises._1_14;

public class WalkmanV1 {

    public static int SERIAL_NUMBER_COUNT;
    private int serialNumber;

    private Jack jackOne;

    static void setSerialNumberCount(int value) {
        SERIAL_NUMBER_COUNT = value;
    }

    static void incrementSerialNumberCount(int value) {
        SERIAL_NUMBER_COUNT += value;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int value) {
        this.serialNumber = value;
    }

    public Jack getJackOne() {
        return this.jackOne;
    }

    public void setJackOne(Jack jackOne) {
        this.jackOne = jackOne;
    }

}
