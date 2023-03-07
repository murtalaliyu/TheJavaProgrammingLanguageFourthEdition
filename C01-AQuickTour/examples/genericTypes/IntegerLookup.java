package examples.genericTypes;

class IntegerLookup implements Lookup<Integer> {
    private String[] names = { "One", "two" };
    private Integer[] values = { 1, 2 };

    public static void main(String[] args) {
        Lookup<Integer> table = new IntegerLookup();
        // ... add entries to table ...
        String[] names = { "One", "two" };
        new IntegerLookup().processValues(names, table);
    }

    public Integer find(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) return values[i];
        }
        return null;    // not found
    }

    /**
     * Suppose in our application we knew that we would always be looking up
     * Integer or Long or Double, etc. - all the subclasses of the Number class.
     */
    void processValues(String[] names, Lookup<? extends Number> table) {
        for (int i = 0; i < names.length; i++) {
            Number value = table.find(names[i]);
            if (value != null) processValue(names[i], value);
        }
    }

    void processValue(String name, Object value) {}
}
