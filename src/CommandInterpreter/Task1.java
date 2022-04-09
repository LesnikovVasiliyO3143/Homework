package CommandInterpreter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg){
        Invoker invoker = new Invoker();
        Scanner parser = new Scanner(System.in);
        while (true) {

            String str = parser.nextLine();
            String[] args = str.split(" ");
            try {
                try {invoker.execute(args[0], args[1], args[2]);}
                catch (ArrayIndexOutOfBoundsException e) {
                    try {invoker.execute(args[0], args[1]);}
                    catch (ArrayIndexOutOfBoundsException e1) {
                        invoker.execute(args[0]);
                    }
                }
            } catch (IllegalStateException e) {
                System.out.println("Такой команды не существует! Пропробуй ещё раз");
            }

        }

    }
}
