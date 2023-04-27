package chp1.chp1_exercises._1_15;

import chp1.chp1_examples.lookup.LookupV1;

public interface LookupV2 extends LookupV1 {

    void add(int index, String name, Object value);
    void remove(int index);

}
