package exercises._2_08;

class LinkedList {

    Object object;
    LinkedList next;

    LinkedList() {}

    LinkedList(Object object) {
        this.object = object;
    }

    LinkedList(LinkedList next) {
        this.next = next;
    }

    LinkedList(Object object, LinkedList next) {
        this.object = object;
        this.next = next;
    }

}
