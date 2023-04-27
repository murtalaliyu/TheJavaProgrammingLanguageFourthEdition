package old.examples.parameterValues;

import old.examples.initializationBlocks.Body;

class PassRef {

    public static void main(String[] args) {
        Body sirius = new Body("Sirius", null);

        System.out.println("before: " + sirius);
        commonName(sirius);
        System.out.println("after: " + sirius);
    }

    public static void commonName(Body bodyRef) {
        bodyRef.name = "Dog Star";
        bodyRef = null;
    }

}
