
// Command interface defining execute and undo methods
public interface Command {
    void execute() throws Exception;
    void undo() throws Exception;
}
