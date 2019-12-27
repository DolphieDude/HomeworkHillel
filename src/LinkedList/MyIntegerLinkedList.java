package LinkedList;

import com.cherevatyi.task3.MyList;

public class MyIntegerLinkedList implements MyList<Integer> {
    private int size;
    private Item list;
    private Item lFinal;

    MyIntegerLinkedList() {
        this.size = 0;
        list = new Item(null, null, null);
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
        if (this.size == 0) {
            this.list.cur = inO;
            this.list.next = this.lFinal;
        }
        else if (this.size == 1) this.lFinal.cur = inO;
        else {
            Item previousFinal = new Item(this.lFinal.prev, this.lFinal.cur, null);
            Item newFinal = new Item(previousFinal, inO, null);
            previousFinal.next = newFinal;
            previousFinal.prev.next = previousFinal;
            this.lFinal = newFinal;
        }
        this.size++;
    }

    @Override
    public void add(int i, Integer inO) {
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();
        Item onIndex = this.list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        Item newIndex = new Item(onIndex.prev, inO, onIndex);
        try {
            onIndex.prev.next = newIndex;
            onIndex.prev = newIndex;
        }
        catch (NullPointerException e) {
            this.list = newIndex;
        }
        if (this.size == 1) lFinal.prev = list;
        this.size++;
    }

    @Override
    public void set(int i, Integer inO) {
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        onIndex.cur = inO;
    }

    @Override
    public void remove(int i) {
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        onIndex.prev.next = onIndex.next;
        try {
            onIndex.next.prev = onIndex.prev;
        }
        catch (NullPointerException e) {
            this.lFinal = this.lFinal.prev;
            this.lFinal.next = null;
        }
        this.size--;
    }

    @Override
    public Integer get(int i) {
        if (i < 0 || i >= this.size) throw new IndexOutOfBoundsException();
        Item onIndex = list;
        for (int j = 0; j < i; j++) onIndex = onIndex.next;
        return onIndex.cur;
    }

    @Override
    public void printList() {
        StringBuilder result = new StringBuilder("[");
        Item onIndex = list;
        for (int j = 0; j < size; j++) {
            try {
                result.append(onIndex.cur).append(";");
            }
            catch (NullPointerException e) {
                break;
            }
            onIndex = onIndex.next;
        }
        result.append("]");
        System.out.println(result);
    }
}
