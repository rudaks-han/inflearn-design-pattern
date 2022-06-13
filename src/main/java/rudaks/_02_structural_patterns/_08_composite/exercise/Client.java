package rudaks._02_structural_patterns._08_composite.exercise;

public class Client {

    public static void main(String[] args) {
        Node node = buildNode();
        node.delete();
    }

    public static Node buildNode() {
        Folder root = new Folder("root");
        Folder folder = new Folder("폴더1");
        folder.addNode(new File("add1.txt"));
        folder.addNode(new File("add2.txt"));
        folder.addNode(new File("add3.txt"));
        root.addNode(folder);

        return folder;
    }
}
