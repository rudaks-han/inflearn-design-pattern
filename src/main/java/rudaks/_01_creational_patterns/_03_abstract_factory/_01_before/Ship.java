package rudaks._01_creational_patterns._03_abstract_factory._01_before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {

    private String name;

    private String color;

    private String logo;

    private Wheel wheel;

    private Anchor anchor;
}
