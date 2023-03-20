package exercises._2_11;

import exercises._2_08.LinkedList;

public class LinkedListV2 extends LinkedList {

    public String toString() {
        String desc = object.toString();
        if (next != null) desc += "\n " + next.toString();
        return desc;
    }

    public void add(Object... list) {
        for (Object object : list) {
            // ... add to linkedList
        }
    }

}
