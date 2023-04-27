package chp1.chp1_examples;

class Point {
    private static int serialNumber;    // this guy is shared among all instances of Point because it is meant to be a "class-wide" variable
    private double x, y;    // instance variables are unique for each Point object
    private static Point origin = new Point();   // this guy is now shared across all instances of Point

    public void clear() {
        x = 0.0;
        y = 0.0;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        double xdiff = x - that.x;
        double ydiff = y - that.y;
        return Math.sqrt(xdiff*xdiff + ydiff*ydiff);    // sqrt here is also a static method
    }

    /**
     * Exercise 1.8
     * Add a method to the Point class that sets the current
     * object's coordinates to those of a passed in Point object
     */
    public void updateTo(Point other) {
        x = other.x;
        y = other.y;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

}
