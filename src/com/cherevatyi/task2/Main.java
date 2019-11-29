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
        System.out.println("Add to add items. Check to check quantity. Sell to sell. Stop to end program");
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
            else if (inputText.equals("sell")) {
                System.out.println("Need to pay " + sell());
            }
        } while (!inputText.equals("stop"));
    }

    //ADD
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
        System.out.println("DONE");
    }
    //SELL
    public static double sell () throws IOException {
        double price = 0;
        System.out.println("Sell goods. Type \"done\" to stop");
        do {
            System.out.println("Enter type and quantity a to sell, dividing by new line");
            inputText = input.readLine().toLowerCase();
            int count = 0;
            if (inputText.equals("bag")) {
                inputText = input.readLine();
                for (int j = 0; j < goods.size(); j++) {
                    if (goods.get(j) instanceof Bag) {
                        count++;
                        price += goods.get(j).price;
                        goods.remove(j);
                        if (count == Integer.parseInt(inputText)) break;
                    }
                }
            }
            else if (inputText.equals("pen")) {
                inputText = input.readLine();
                for (int j = 0; j < goods.size(); j++) {
                    if (goods.get(j) instanceof Pen) {
                        count++;
                        price += goods.get(j).price;
                        goods.remove(j);
                        if (count == Integer.parseInt(inputText)) break;
                    }
                }
            }
            else if (inputText.equals("copybook")) {
                inputText = input.readLine();
                for (int j = 0; j < goods.size(); j++) {
                    if (goods.get(j) instanceof Copybook) {
                        count++;
                        price += goods.get(j).price;
                        goods.remove(j);
                        if (count == Integer.parseInt(inputText)) break;
                    }
                }
            }
        } while (!inputText.equals("done"));
        System.out.println("DONE");
        return price;
    }
    //CHECK
    public static void check () {
        int bc = 0, pc = 0, cc = 0;
        for (Good g: goods) {
            if (g instanceof Bag) bc++;
            else if (g instanceof Pen) pc++;
            else if (g instanceof Copybook) cc++;
        }
        System.out.println("Here is quantity of goods: ");
        System.out.println("Bags: " + bc);
        System.out.println("Pens: " + pc);
        System.out.println("Copybooks: " + cc);
    }
}
