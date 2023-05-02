package chp3;

/**
 * The SimpleSortDouble class implements doSort with
 * a very slow but simple sort algorithm (a "selection sort")
 * whose primary advantage is that it is easy to code and easy
 * to understand.
 */
class SimpleSortDouble extends SortDouble {

    @Override
    protected void doSort() {
        for (int i = 0; i < getDataLength(); i++) {
            for (int j = i+1; j < getDataLength(); j++) {
//                if (compare(i, j) > 0) swap(i, j);
                if (probe(i) > probe(j)) swap(i, j);
            }
        }
    }
}
