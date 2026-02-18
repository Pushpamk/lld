import java.util.*;

public class Folder implements FileSystemComponent {
    private List<FileSystemComponent> list = new ArrayList<>();
    private String name;

    Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent fileSystemComponent) {
        list.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent) {
        list.remove(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent fsc : list) {
            fsc.showDetails();
        }
    }
}