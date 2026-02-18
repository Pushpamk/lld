class Main {
    public static void main(String[] args) {
        FileSystemComponent file = new File("abs.txt");
        Folder folder = new Folder("/core");
        FileSystemComponent tmp = new Folder("/tmp");

        folder.add(file);
        folder.add(tmp);

        folder.showDetails();
    }
}