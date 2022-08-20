package homework71;

public class FolderRunner {
    public static void main(String[] args) {
        Folder folder = new Folder();

        User user = new User(
                new AddCommand(folder),
                new DeleteCommand(folder),
                new ReadCommand(folder),
                new WriteCommand(folder)
        );

        user.addFolder();
        user.deleteFolder();
        user.readFolder();
        user.writeFolder();
    }
}
