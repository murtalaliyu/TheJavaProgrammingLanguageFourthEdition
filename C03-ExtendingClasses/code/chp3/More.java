package chp3;

class More extends Base {

    protected String name() { return "More"; }

    protected void printMore() {
        Base sref = (Base) this;

        System.out.println("this.name()  = " + this.name());    // More
        System.out.println("sref.name()  = " + sref.name());    // More
        System.out.println("super.name() = " + super.name());   // Base

        More mref = (More) sref;
        if (sref instanceof More) mref = (More) sref;
    }

    public static void main(String[] args) {
        new More().printMore();
    }

}
