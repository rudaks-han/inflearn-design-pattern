package rudaks._03_behavior_patterns._15_iterator._before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Board {

    private List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }
}
