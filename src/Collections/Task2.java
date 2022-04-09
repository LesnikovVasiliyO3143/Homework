package Collections;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) throws IOException{
        String read = "File3.txt";
        Path path = Paths.get(read);
        Scanner scanner = new Scanner(path);
        int n = scanner.nextInt();
        int[] grass = new int [n];
        for (int i=0; n>i; i++){
            grass[i] = scanner.nextInt();
        }
        Arrays.sort(grass);
        ArrayDeque tree = new ArrayDeque(n);
        for (int i=0; n>i; i++){
            tree.addLast(grass[i]);
        }
        tree.forEach(x-> System.out.println(x));
        }
    }