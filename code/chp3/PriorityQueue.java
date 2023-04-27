package chp3;

public class PriorityQueue extends SingleLinkQueue {

    @Override
    public void add(Object item) { /* ... */ }

    // This will compile
    public void merge(PriorityQueue q) {
        Cell first = q.head;
        // ...
    }

    // This will not compile (if in separate packages. see p.95)
    public void merge(SingleLinkQueue q) {
        Cell first = q.head;
        // ...
    }

}
