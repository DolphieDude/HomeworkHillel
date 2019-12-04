package com.cherevatyi.task3;

public class MyStringArrayList implements MyList {
    private int size, freeSpace1, freeSpace2;
    private String[][] mainList = new String[10][];

    MyStringArrayList () {
        this.size = 0;
        this.freeSpace1 = 0;
        this.freeSpace2 = 0;
        this.mainList[0] = new String[10];
    }

    @Override
    public int size () { return this.size; }
    public void checkSizes () {}
    public void add (Object inO) {
        this.mainList[this.freeSpace1][this.freeSpace2] = inO.toString();
        this.size++;
        if (this.freeSpace2 == 9) {
            this.freeSpace1++;
            this.freeSpace2 = 0;
        }
        else this.freeSpace2++;
    }
    public void add (int i, Object inO) {}
    public void set (int i, Object inO) { this.mainList[i / 10][i - i / 10] = inO.toString(); }
    public void remove (int i) {
        this.size--;
        for (int j = i; j < this.size - 2; j++) { this.mainList[j / 10][j - j / 10] =
                this.mainList[(j + 1) / 10][j + 1 - (j + 1) / 10]; }
    }
    public String get (int i) { return this.mainList[i / 10][i - i / 10]; }
    public void printList () {
        for (String[] sarr: this.mainList) {
            for (String s: sarr) {
                System.out.print(s + ";");
            }
        }
        System.out.println();
    }
}
