package chp3;

class Y extends X {
    /**
     * Exercise 3.2
     */

    protected int yMask = 0xff00;

    public Y() {
        System.out.printf("\nY const\tPre\t\txMask\t\t%x", xMask);
        System.out.printf("\nY const\tPre\t\tfullMask\t%x", fullMask);
        System.out.printf("\nY const\tPre\t\tyMask\t\t%x", yMask);
        System.out.println("\n------------------------------------------------");

        fullMask |= yMask;

        System.out.printf("\nY const\tPost\txMask\t\t%x", xMask);
        System.out.printf("\nY const\tPost\tfullMask\t%x", fullMask);
        System.out.printf("\nY const\tPost\tyMask\t\t%x", yMask);
        System.out.println("\n------------------------------------------------");
    }

    public static void main(String[] args) {
        new Y();
    }

}
