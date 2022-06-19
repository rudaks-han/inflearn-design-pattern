package rudaks._03_behavior_patterns._15_iterator._before;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("새글1");
        board.addPost("새글2");
        board.addPost("새글3");

        List<Post> posts = board.getPosts();
        Iterator<Post> postIterator = posts.iterator();
        System.out.println(postIterator.getClass());

        for (int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getContent());
        }

        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getContent());
        }

    }
}
