package homework71;

public class ReadCommand implements Command{
    Folder folder;

    public ReadCommand(Folder folder) {
        this.folder = folder;
    }

    @Override
    public void execute() {
        folder.read();
    }
}
