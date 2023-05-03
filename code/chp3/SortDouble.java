package chp3;

/**
 * EXERCISE 3.11 IS INCONCLUSIVE
 */

abstract class SortDouble {

    private double[] values;
    private final SortMetrics curMetrics = new SortMetrics();

    /** Invoked to do the full sort */
    public final SortMetrics sort(double[] data) {
        values = data;
        curMetrics.init();
        doSort();
        return getMetrics();
    }

    public final SortMetrics getMetrics() {
        return curMetrics.clone();
    }

    /** For extended classes to know the number of elements */
    protected final int getDataLength() {
        return values.length;
    }

    /** For extended classes to probe elements */
    protected final double probe(int i) {
        curMetrics.probeCnt++;
        return values[i];
    }

    /** For extended classes to compare elements */
    protected final int compare(int i, int j) {
        curMetrics.compareCnt++;
        double d1 = values[i];
        double d2 = values[j];
        if (d1 == d2) return 0;
        return (d1 < d2 ? -1 : 1);
    }

    /** For extended classes to swap elements */
    protected final void swap(int i, int j) {
        curMetrics.swapCnt++;
        double tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    /** Extended classes implement this -- used by sort */
    protected abstract void doSort();

}
