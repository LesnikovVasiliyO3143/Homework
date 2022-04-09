package Collections;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Stack;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Task1 {
    public static void main(String[] args) throws IOException{
        String read = "File2.txt";
        Path path = Paths.get(read);
        Scanner scanner = new Scanner(path);
        Stack stack = new Stack();
        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            stack.add(number);
        }
        scanner.close();
        FileWriter writer = new FileWriter("Collections.File1.txt");
        PrintWriter ship = new PrintWriter(writer);
        while(!stack.isEmpty()){
            ship.println(stack.pop());
        }
        ship.close();
    }
}