package com.cherevatyi.task3;

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        MyStringArrayList list = new MyStringArrayList();
        list.add("hello");
        list.add("list");
        list.printList();
        list.remove(list.size() - 1);
        list.printList();
        list.add(0, "java");
        list.printList();
        list.add("hillel");
        list.add("something");
        list.add(2, "yes");
        list.printList();
        list.remove(3);
        list.printList();
        list.set(3, "nothing");
        list.printList();
        System.out.println(list.get(1));
        for (int i = 0; i < 50; i++) list.add("loop" + i);
        list.printList();
        list.add("notLooped");
        list.remove(10);
        list.printList();
        list.add(12, "hey");
        list.printList();
    }
}
