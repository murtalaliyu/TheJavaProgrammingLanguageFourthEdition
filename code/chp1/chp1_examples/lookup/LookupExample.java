package chp1.chp1_examples.lookup;

class LookupExample {

    public static void main(String[] args) {
        String[] names = new String[]{"a", "b", "c"};
        Object[] values = new Object[3];
        new LookupExample().processValues(names, new SimpleLookup(names, values));
    }

    void processValues(String[] names, LookupV1 table) {
        for (int i = 0; i < names.length; i++) {
            Object value = table.find(names[i]);
            if (value != null) processValue(names[i], value);
        }
    }

    void processValue(String name, Object value) {
        // do something
    }

}
