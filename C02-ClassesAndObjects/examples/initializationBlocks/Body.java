package examples.initializationBlocks;

class Body {

    public long idNum;
    public String name = "<unnamed>";
    public Body orbits = null;

    private static long nextID = 0;

    // This will execute as if it were placed at the beginning of every constructor in the class
    {
        idNum = nextID++;
    }

    public Body() {}

    public Body(String bodyName, Body orbitsAround) {
        name = bodyName;
        orbits = orbitsAround;
    }

    public static void main(String[] args) {
        Body sun = new Body("Sun", null);
        System.out.println(Body.nextID);

        Body mercury = new Body();
        System.out.println(Body.nextID);

        Body earth = new Body("Earth", sun);
        System.out.println(Body.nextID);

        Body venus = new Body();
        System.out.println(Body.nextID);
    }

}
