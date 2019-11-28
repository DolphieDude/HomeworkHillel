package com.cherevatyi;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Cat> cats = new ArrayList<Cat>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name, color;
        int age, weight;
        System.out.println("Enter cats, to end enter empty name");
        while (true) {
            System.out.print("Name = ");
            name = input.readLine();
            if (name.equals("")) break;
            System.out.print("Color = ");
            color = input.readLine();
            System.out.print("Age = ");
            try { age = Integer.parseInt(input.readLine()); }
            catch (Exception e) { age = 0; }
            System.out.print("Weight = ");
            try { weight = Integer.parseInt(input.readLine()); }
            catch (Exception e) { weight = 0; }
            cats.add(new Cat(name, color, age, weight));
        }
        System.out.println("Your saved cats:");
        for (Cat c: cats) { System.out.println(c); }
    }
}
