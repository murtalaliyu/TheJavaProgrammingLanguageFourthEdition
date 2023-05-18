package chp3;

/**
 * SortMetrics objects describe the cost of a particular sorting run.
 * The class has three public fields. Its only task is to communicate
 * data, so there's no need to hide that data behind accessor methods.
 */
public final class SortMetrics implements Cloneable {

    public long probeCnt,       // simple data probes
                compareCnt,     // comparing two elements
                swapCnt;        // swapping two elements

    public void init() {
        probeCnt = swapCnt = compareCnt = 0;
    }

    public String toString() {
        return probeCnt + " probes " +
                compareCnt + " compares " +
                swapCnt + " swaps";
    }

    /**
     * This class supports clone.
     * SortDouble.getMetrics return a copy of the data
     * so that it doesn't give out a reference to its
     * internal data. This prevents both the code that
     * creates SortDouble objects and the code in the
     * extended classes from changing the data.
     */
    public SortMetrics clone() {
        try {
            // default mechanism works
            return (SortMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            // can't happen: this and Object both clone
            throw new InternalError(e.toString());
        }
    }

}
