package chp3;

public class MyClass extends HerClass implements Cloneable {

    public MyClass clone() throws CloneNotSupportedException {
        return (MyClass) super.clone();
    }

    // ...

}
