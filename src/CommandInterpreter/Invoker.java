package CommandInterpreter;

import java.util.HashMap;

public class Invoker {
    private static HashMap<String, Command> commandMap = new HashMap<>();
    public Invoker() {
        this.register("hello", new Hello());
        this.register("repeat", new Repeat());
    }

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }
    public void execute(String commandName,  String arg) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute(arg);
    }
    public void execute(String commandName, String arg1, String arg2) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute(arg1,arg2);
    }
        }