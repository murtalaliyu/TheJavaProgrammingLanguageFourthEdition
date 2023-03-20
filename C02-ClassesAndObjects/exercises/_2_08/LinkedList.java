package exercises._2_08;

public class LinkedList {

    protected Object object;
    protected LinkedList next;

    protected LinkedList() {}

    LinkedList(Object object) {
        this.object = object;
    }

    LinkedList(LinkedList next) {
        this.next = next;
    }

    protected LinkedList(Object object, LinkedList next) {
        this.object = object;
        this.next = next;
    }

}
