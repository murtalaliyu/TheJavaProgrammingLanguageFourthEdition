package chp4;

import chp1.chp1_examples.Point;

class Sorter {

    static Comparable<?>[] sort(Comparable<?>[] list) {
        // implementation details ...

        /**
         * References of interface types can be used only to access
         * members of that interface. See [p.120]
         */
        Comparable<Point> p1 = null;
        Comparable<Point> obj = new Point();
//        double dist = obj.distance(p1);  // INVALID: Comparable has no distance method
        double distance = ((Point) obj).distance((Point) p1);

        /**
         * The following is legal as it is assigning
         * an interface reference to an Object reference.
          */
        String desc = obj.toString();

        return list;
    }

}
