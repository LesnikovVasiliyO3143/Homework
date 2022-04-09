package CommandInterpreter;

public abstract class Command {
        public void execute() {
            System.out.println("Ввод без аргумента не поддерживается командой");
        }
        public void execute(String name) {
            System.out.println("Ввод аргументов не поддерживается коммандой");
        }
        public void execute(String n, String m){
            System.out.println("Ввод двух аргументов невозможен");
        }
}
