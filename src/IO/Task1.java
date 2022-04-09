package IO;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String read = "File1.txt";
        Path path = Paths.get(read);
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}