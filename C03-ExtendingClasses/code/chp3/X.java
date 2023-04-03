class X {

    protected int xMask = 0x00ff;
    protected int fullMask;

    public X() {
        System.out.printf("\nX const\tPre\t\txMask\t\t%x", xMask);
        System.out.printf("\nX const\tPre\t\tfullMask\t%x", fullMask);
        System.out.println("\n------------------------------------------------");

        fullMask = xMask;

        System.out.printf("\nX const\tPost\txMask\t\t%x", xMask);
        System.out.printf("\nX const\tPost\tfullMask\t%x", fullMask);
        System.out.println("\n------------------------------------------------");
    }

    public int mask(int orig) {
        return (orig & fullMask); }

    public static void main(String[] args) {
        new X();
    }

}
