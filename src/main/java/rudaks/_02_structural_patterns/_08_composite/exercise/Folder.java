package rudaks._02_structural_patterns._08_composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Node {

    private String name;

    private List<Node> nodes = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    @Override
    public void delete() {
        nodes.stream().forEach(Node::delete);
        System.out.println("delete folder: " + name);
    }
}
