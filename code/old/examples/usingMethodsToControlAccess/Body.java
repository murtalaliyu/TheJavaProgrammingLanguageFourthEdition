package old.examples.usingMethodsToControlAccess;

class Body {

    private long idNum;
    private String name = "<unnamed>";
    private Body orbits = null;

    private static long nextID = 0;

    // constructors omitted ...

    public long getID() { return idNum; }
    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
    public Body getOrbits() { return orbits; }
    public void setOrbits(Body orbitsAround) { orbits = orbitsAround; }

}
