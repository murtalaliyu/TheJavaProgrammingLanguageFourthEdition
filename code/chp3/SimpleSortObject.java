package chp3;

class SimpleSortObject<T extends Comparable<T>> extends SortObject<T> {

    @Override
    protected void doSort() {
        for (int i = 0; i < getDataLength(); i++) {
            for (int j = 0; j < getDataLength(); j++) {
                if (compare(probe(i), probe(j)) < 0) swap(i, j);    // ascending order
            }
        }
    }

}
