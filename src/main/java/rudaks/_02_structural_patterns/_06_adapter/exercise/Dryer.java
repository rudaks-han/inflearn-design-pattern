package rudaks._02_structural_patterns._06_adapter.exercise;

public class Dryer implements Electronic110V {
    @Override
    public void connect() {
        System.out.println("110V 드라이어 연결");
    }
}
