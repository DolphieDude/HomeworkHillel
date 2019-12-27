package LinkedList;

import com.cherevatyi.task3.MyList;

public class Main {
    public static void main(String[] args) {
        MyIntegerLinkedList list = new MyIntegerLinkedList();
        list.add(1);
        list.add(2);
        list.printList();
        list.remove(list.size() - 1);
        list.printList();
        list.add(0, 3);
        list.printList();
        list.add(4);
        list.add(5);
        list.add(2, 6);
        list.printList();
        list.remove(3);
        list.printList();
        list.set(2, 7);
        list.printList();
        System.out.println(list.get(1));
        for (int i = 0; i < 50; i++) list.add(9 + i);
        list.printList();
        list.add(10);
        list.remove(7);
        list.printList();
        list.add(12, 11);
        list.printList();
    }
}
