package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int IF_EMPTY_RETURN = -1;
    private Node last;
    private int i;

    public static int getIfEmptyReturn() {
        return IF_EMPTY_RETURN;
    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.setPrev(last);
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return IF_EMPTY_RETURN;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return IF_EMPTY_RETURN;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
