package exercises;

public class FibonacciValue {
    private int value;
    private boolean isEven;

    public FibonacciValue(int value, boolean isEven) {
        this.value = value;
        this.isEven = isEven;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getIsEven() {
        return this.isEven;
    }

    public void setIsEven(boolean isEven) {
        this.isEven = isEven;
    }
}
