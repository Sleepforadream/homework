package homework71;

public class WriteCommand implements Command{
    Folder folder;

    public WriteCommand(Folder folder) {
        this.folder = folder;
    }

    @Override
    public void execute() {
        folder.write();
    }
}
