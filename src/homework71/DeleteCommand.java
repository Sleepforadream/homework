package homework71;

public class DeleteCommand implements Command {
    Folder folder;

    public DeleteCommand(Folder folder) {
        this.folder = folder;
    }

    @Override
    public void execute() {
        folder.delete();

    }
}
