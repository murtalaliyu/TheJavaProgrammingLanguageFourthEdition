package exercises._2_16;

import exercises._2_14.LinkedList;

public class LinkedListV2 extends LinkedList {

    public int getListCount() {
        int count = 0;
        LinkedList l = getNext();
        while (l != null) {
            count++;
            l = l.getNext();
        }
        return count;
    }

}
