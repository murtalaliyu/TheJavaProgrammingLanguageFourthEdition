package exercises._1_15;

import examples.lookup.SimpleLookup;

class ExtendedLookup extends SimpleLookup implements LookupV2 {

    public void add(int index, String name, Object value) {
        String[] names = super.getNames();
        names[index] = name;

        Object[] values = super.getValues();
        values[index] = value;
    }

    public void remove(int index) {
        String[] names = super.getNames();
        names[index] = null;

        Object[] values = super.getValues();
        values[index] = null;
    }

}
