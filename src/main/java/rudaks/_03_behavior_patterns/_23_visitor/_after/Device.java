package rudaks._03_behavior_patterns._23_visitor._after;

public interface Device {

    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
