package IO;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String read = "File3.txt";
        Path path = Paths.get(read);
        Scanner scanner = new Scanner(path);
        int Max = 0;
        while (scanner.hasNextLine()) {
            int sleep = scanner.nextLine().length();
            if (Max < sleep) {
                Max = sleep;
            }
        }
        scanner.close();
        Scanner scanner2 = new Scanner(path);
        while (scanner2.hasNextLine()) {
            String sleep = scanner2.nextLine();
            if (Max == sleep.length()) {
                System.out.println(sleep);
            }
        }
    }
}