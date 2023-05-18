package chp4;

import chp2.LinkedList;

public interface CloneableLinkedList extends Cloneable {

    LinkedList clone();

    Object getObject();

    void setObject(Object o);

    LinkedList getNext();

    void setNext(LinkedList c);
}
