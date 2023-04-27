package old.examples.parameterValues;

class PassByValue {

    public static void main(String[] args) {
        double one = 1.0;

        System.out.println("before: one = " + one);
        halveIt(one);
        System.out.println("after: one = " + one);
    }

    public static void halveIt(double arg) {
        arg /= 2.0;     // divide arg by two
        System.out.println("halved: arg = " + arg);
    }

}
