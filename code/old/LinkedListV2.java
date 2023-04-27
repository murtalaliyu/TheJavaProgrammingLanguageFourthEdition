package old;

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
