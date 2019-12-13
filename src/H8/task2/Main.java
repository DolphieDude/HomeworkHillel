package H8.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String in, out, copy;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean isException;
        do {
            isException = false;
            System.out.println("Enter path of file to copy");
            in = input.readLine();
            try (BufferedReader outFile = new BufferedReader(new FileReader(in))) {
                System.out.println("Enter path where to copy");
                out = input.readLine();
                BufferedWriter inFile = new BufferedWriter(new FileWriter(out));
                while (true) {
                    copy = outFile.readLine();
                    if (copy != null) inFile.write(copy);
                    else break;
                }
                inFile.close();
            } catch (IOException e) { isException = true; }
        } while (isException);
    }
}
