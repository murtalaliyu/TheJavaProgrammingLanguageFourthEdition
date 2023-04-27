package old._2_06;

import old._2_05.Vehicle;

class LinkedList {

    private Object object;
    private LinkedList next;

    public LinkedList() {}

    public LinkedList(Object object, LinkedList next) {
        this.object = object;
        this.next = next;
    }

    public static void main(String[] args) {
        Vehicle honda = new Vehicle();
        Vehicle ferrari = new Vehicle();

        LinkedList list = new LinkedList();
        list.object = honda;
        list.next = new LinkedList(ferrari, null);
    }

}
