package com.cherevatyi.task2;

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Good> goods = new ArrayList<Good>();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String inputText;

    public static void main(String[] args) throws IOException {
        String password;
        System.out.println("Enter your password to set it");
        password = input.readLine().toLowerCase();
        for (int i = 1; i <= 30; i++) { System.out.println("*"); }
        do {
            inputText = input.readLine().toLowerCase();
            if (inputText.equals("add")) {
                System.out.println("Enter password:");
                inputText = input.readLine().toLowerCase();
                if (inputText.equals(password)) add();
            }
            else if (inputText.equals("check")) {
                System.out.println("Enter password:");
                inputText = input.readLine().toLowerCase();
                if (inputText.equals(password)) check();
            }
        } while (!inputText.equals("stop"));
    }

    public static void add () throws IOException {
        System.out.println("Add goods. Type \"done\" to stop");
        do {
            System.out.println("Enter type of good and quantity, dividing by new line");
            inputText = input.readLine().toLowerCase();
            if (inputText.equals("bag")) {
                inputText = input.readLine();
                for (int i = 0; i < Integer.parseInt(inputText); i++) goods.add(new Bag());
            }
            else if (inputText.equals("pen")) {
                inputText = input.readLine();
                for (int i = 0; i < Integer.parseInt(inputText); i++) goods.add(new Pen());
            }
            else if (inputText.equals("copybook")) {
                inputText = input.readLine();
                for (int i = 0; i < Integer.parseInt(inputText); i++) goods.add(new Copybook());
            }
        } while (!inputText.equals("done"));
    }
    public static void check () {
        int bc = 0, pc = 0, cc = 0;
        for (Good g: goods) {
            if (g instanceof Bag) bc++;
            else if (g instanceof Pen) pc++;
            else cc++;
        }
        System.out.println("Here is quantity of goods: ");
        System.out.println("Bags: " + bc);
        System.out.println("Pens: " + pc);
        System.out.println("Copybooks: " + cc);
    }
}
