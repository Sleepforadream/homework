package homework71;

public class AddCommand implements Command {
    Folder folder;

    public AddCommand(Folder folder) {
        this.folder = folder;
    }

    @Override
    public void execute() {
        folder.add();
    }
}
