package rudaks._03_behavior_patterns._15_iterator._after;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("새글1");
        board.addPost("새글2");
        board.addPost("새글3");

        Iterator<Post> iterator = board.getPosts().iterator();
        while (iterator.hasNext()) {
            iterator.hasNext();
        }
    }
}
