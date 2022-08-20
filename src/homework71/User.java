package homework71;

public class User {
    Command add;
    Command delete;
    Command read;
    Command write;

    public User(Command add, Command delete, Command read, Command write) {
        this.add = add;
        this.delete = delete;
        this.read = read;
        this.write = write;
    }

    public void addFolder() {
        add.execute();
    }

    public void deleteFolder() {
        delete.execute();
    }

    public void readFolder() {
        read.execute();
    }

    public void writeFolder() {
        write.execute();
    }
}
