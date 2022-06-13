package rudaks._02_structural_patterns._08_composite.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class File implements Node {

    private String name;

    @Override
    public void delete() {
        System.out.println("delete file: " + name);
    }
}
