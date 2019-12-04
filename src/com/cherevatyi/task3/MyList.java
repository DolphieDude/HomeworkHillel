package com.cherevatyi.task3;

public interface MyList <T> {
    int size ();
    void checkSizes ();
    void add (T inO);
    void add (int i, T inO);
    void set (int i, T inO);
    void remove (int i);
    T get (int i);
    void printList ();
}
