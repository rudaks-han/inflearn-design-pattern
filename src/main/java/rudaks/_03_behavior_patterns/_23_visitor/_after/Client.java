package rudaks._03_behavior_patterns._23_visitor._after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.accept(new Phone());
    }
}
