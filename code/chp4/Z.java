package chp4;

class Z implements Y {

    void example1() {
        System.out.println("Z.val=" + Z.val + ", Z.sum=" + Z.sum);
    }

    void example2() {
        Z z = new Z();
        System.out.println("z.val=" + z.val +
                ", ((Y)z).val=" + ((Y)z).val +
                ", ((X)z).val=" + ((X)z).val);
    }

    public static void main(String[] args) {
        new Z().example2();
    }

}
