package examples.aSimpleClass;

/*
It is usually not a good idea to declare the fields of a class as public
 */

class Body {
    public long idNum;
    public String name;
    public Body orbits;

    public static long nextID = 0;
}
