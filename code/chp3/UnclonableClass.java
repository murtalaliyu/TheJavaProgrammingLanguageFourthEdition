package chp3;

public class UnclonableClass {
    protected UnclonableClass clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
