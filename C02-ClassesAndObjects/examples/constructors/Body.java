package examples.constructors;

class Body {

    public long idNum;
    public String name = "<unnamed>";
    public Body orbits = null;

    private static long nextID = 0; // we should make nextID private so that only the Body class can access it

    Body() {
        idNum = nextID++;
    }

}
