package CommandInterpreter;

public class Hello extends Command {
    public void execute(){
        System.out.println("Hello World");
    }
    public void execute(String word){
        System.out.println("Hello " + word);
    }
}
