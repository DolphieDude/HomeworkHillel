package LinkedList;

import com.cherevatyi.task3.MyList;

public class MyIntegerLinkedList implements MyList<Integer> {
    private int size;
    private Item list;
    private Item lFinal;

    public MyIntegerLinkedList() {
        this.size = 0;
        list = new Item(null, null, this.lFinal);
        lFinal = new Item(this.list, null, null);
    }

    private class Item {
        Integer cur;
        Item next;
        Item prev;

        Item(Item prev, Integer cur, Item next) {
            this.prev = prev;
            this.cur = cur;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(Integer inO) {
        Item newFinal = null;
        Item previousFinal = new Item(this.lFinal.prev, this.lFinal.cur, newFinal);
        newFinal = new Item(previousFinal, inO, null);
        this.lFinal = newFinal;
    }

    @Override
    public void add(int i, Integer inO) {
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        Item nextIndex = onIndex.next;
        Item newIndex = new Item(onIndex, inO, nextIndex);
        onIndex.next = newIndex;
        nextIndex.prev = newIndex;
    }

    @Override
    public void set(int i, Integer inO) {
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        onIndex.cur = inO;
    }

    @Override
    public void remove(int i) {
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        onIndex.prev.next = onIndex.next; //TODO: CHECK THIS WORK. Make test with temporary toString
        onIndex.next.prev = onIndex.prev;
        System.out.println(onIndex.prev.next.cur + " = previous next; next previous = " + onIndex.next.prev.cur);
    }

    @Override
    public Integer get(int i) {
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        return onIndex.cur;
    }
}
