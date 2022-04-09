package IO;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String read = "File1.txt";
        Path path = Paths.get(read);
        Scanner scanner = new Scanner(path);
        int i = 1;
        while (scanner.hasNextLine()) {
            System.out.println(i+". "+ scanner.nextLine());
            i = i+1;
        }
    }
}