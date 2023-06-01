package chp5;

/**
 * EXERCISE 5.2 IS INCONCLUSIVE
 */

import java.util.*;

public class BankAccountV3 extends BankAccountV2 {

    private History lastTenActions;

    public History history() {
        return new History<Action>(new ArrayList<>(), 0);
    }

    static class History<T> {
        private Deque<T> stack;
        private Iterator<T> iterator;
        private int itemsRemaining;

        public History(List<T> items, int N) {
            this.stack = new ArrayDeque<>(items);
            this.iterator = stack.descendingIterator();
            this.itemsRemaining = Math.min(N, items.size());
        }

        public T next() {
            if (itemsRemaining == 0 || !iterator.hasNext()) {
                return null;
            }
            itemsRemaining--;
            return iterator.next();
        }
    }

}
