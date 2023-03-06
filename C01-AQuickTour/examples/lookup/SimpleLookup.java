package examples.lookup;

public class SimpleLookup implements LookupV1 {
    private String[] names;
    private Object[] values;

    public SimpleLookup() {};

    public SimpleLookup(String[] names, Object[] values) {
        this.names = names;
        this.values = values;
    }

    public Object find(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) return values[i];
        }
        return null;    // not found
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }
}
