package chp2;

import chp4.CloneableLinkedList;

/** EXERCISE 3.10 IS INCONCLUSIVE */

public class LinkedList implements CloneableLinkedList {

    private Object object;
    private LinkedList next;

    public LinkedList clone() {
        try {
            return (LinkedList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.setObject(1);
        LinkedList list1Child = new LinkedList();
        list1Child.setObject(1.1);
        list1.setNext(list1Child);

        // -------------------------------------------

        LinkedList list2 = list1.clone();

        // -------------------------------------------

        list1.setObject(2);
        LinkedList list1ChildNew = new LinkedList();
        list1ChildNew.setObject(1.2);
        list2.setNext(list1ChildNew);

        // -------------------------------------------

        System.out.println("list1 object: " + list1.getObject());
        System.out.println("list1 next: " + list1.getNext().getObject());
        System.out.println("list2 object: " + list2.getObject());
        System.out.println("list2 next: " + list2.getNext().getObject());
    }
}
