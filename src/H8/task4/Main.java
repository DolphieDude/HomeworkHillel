package H8.task4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simple = new SimpleDateFormat("MMM dd, yyyy");
        System.out.print("Enter date in format mm/dd/yyyy: ");
        System.out.println(simple.format(new Date(input.readLine())));
    }
}
