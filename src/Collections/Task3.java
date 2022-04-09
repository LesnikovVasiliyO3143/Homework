package Collections;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) throws IOException{
        String read = "File4.txt";
        Path path = Paths.get(read);
        Scanner scanner = new Scanner(path);
        LinkedList list = new LinkedList();
        while(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            list.addFirst(number);
        }
        scanner.close();
        list.forEach(x->System.out.println(x));
        }
    }