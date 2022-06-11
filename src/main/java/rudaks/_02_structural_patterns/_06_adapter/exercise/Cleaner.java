package rudaks._02_structural_patterns._06_adapter.exercise;

public class Cleaner implements Electronic220V {
    @Override
    public void connect() {
        System.out.println("200V 청소기 연결");
    }
}
