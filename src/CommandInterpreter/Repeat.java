package CommandInterpreter;

public class Repeat extends Command{
    public void execute(String n, String m){
        int num = Integer.valueOf(n);
        for (int i=0; i<num; i++){System.out.println(m);}
    }
}
