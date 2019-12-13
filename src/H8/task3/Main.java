package H8.task3;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> ints = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        String in;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter words and number. \"done\" if you need to stop");
        while (true) {
            in = input.readLine();
            if (in.toLowerCase().equals("done")) break;
            try { ints.add(Integer.valueOf(in)); } catch (NumberFormatException e) { strings.add(in); }
        }
        for (int i = ints.size(); i > 0; i--) for (int j = 0; j < i - 1; j++) if (ints.get(j) < ints.get(j + 1)) swap(ints, j, j + 1);
        for (int i = strings.size(); i > 1; i--) for (int j = 0; j < i - 1; j++) if (isStringBigger(strings.get(j), strings.get(j + 1)))
            swap(strings, j, j + 1);
        System.out.println("Numbers in down:");
        for (Integer i: ints) System.out.println(i);
        System.out.println("Words in up by Unicode:");
        for (String s: strings) System.out.println(s);
    }

    static <T> void swap (List<T> list, int ind1, int ind2) {
        T swapper;
        swapper = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, swapper);
    }
    static boolean isStringBigger (String isBigger, String then) {
        int size;
        if (isBigger.length() > then.length()) size = then.length();
        else size = isBigger.length();
        for (int i = 0; i < size; i++) {
            if ((int)isBigger.charAt(i) > (int)then.charAt(i)) return true;
            else if ((int)isBigger.charAt(i) < (int)then.charAt(i)) return false;
        }
        return false;
    }
}
