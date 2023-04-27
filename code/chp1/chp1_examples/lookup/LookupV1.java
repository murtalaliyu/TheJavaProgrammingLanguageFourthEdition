package chp1.chp1_examples.lookup;

public interface LookupV1 {
    /**
     * Return the value associated with the name,
     * or null if there is no such value
     */
    Object find(String name);
}
