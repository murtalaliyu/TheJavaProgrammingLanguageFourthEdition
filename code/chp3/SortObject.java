package chp3;

import java.util.Comparator;

abstract class SortObject<T extends Comparable<T>> implements Comparator<T> {

    private T[] values;
    private  final SortMetrics curMetrics = new SortMetrics();

    @Override
    public final int compare(T o1, T o2) {
        curMetrics.compareCnt++;
        return o1.compareTo(o2);
    }

    /** Invoked to do the full sort */
    public final SortMetrics sort(T[] data) {
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
    protected final T probe(int i) {
        curMetrics.probeCnt++;
        return values[i];
    }

    /** For extended classes to swap elements */
    protected final void swap(int i, int j) {
        curMetrics.swapCnt++;
        T tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    /** Extended classes implement this -- used by sort */
    protected abstract void doSort();

}
