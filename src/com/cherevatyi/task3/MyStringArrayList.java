package com.cherevatyi.task3;

public class MyStringArrayList implements MyList {
    private int size;
    private String[][] mainList = new String[10][];

    MyStringArrayList () {
        this.size = 0;
        this.mainList[0] = new String[10];
    }

    @Override
    public int size () { return this.size; }
    //controlSizes adds new array on previous array with 9 elements
    public void controlSizes () { if (this.size < 100) if (this.size % 10 == 8) this.mainList[this.size() / 10 + 1]
            = new String[10]; }
    public void add (Object inO) {
        this.mainList[this.size / 10][this.size % 10] = inO.toString();
        this.size++;
        controlSizes();
    }
    public void add (int i, Object inO) {
        for (int j = this.size; j > i; j--) { this.mainList[j / 10][j % 10] =
                this.mainList[(j - 1) / 10][(j - 1) % 10]; }
        this.mainList[i / 10][i % 10] = inO.toString();
        this.size++;
        controlSizes();
    }
    public void set (int i, Object inO) { this.mainList[i / 10][i % 10] = inO.toString(); }
    public void remove (int i) {
        for (int j = i; j <= this.size; j++) { this.mainList[j / 10][j % 10] =
                this.mainList[(j + 1) / 10][(j + 1) % 10]; }
        this.size--;
    }
    public String get (int i) { return this.mainList[i / 10][i % 10]; }
    public void printList () {
        for (String[] sarr: this.mainList) {
            for (String s: sarr) {
                if (s == null) {
                    System.out.println();
                    return;
                }
                System.out.print(s + ";");
            }
        }
        System.out.println();
    }
}
