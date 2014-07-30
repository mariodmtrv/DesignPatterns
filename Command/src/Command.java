/**
 * Declares an interface for all commands. A command is invoked through its execute method, which asks a receiver to perform an action. 
 * */
public interface Command {
public void execute();
public void undo();
}
