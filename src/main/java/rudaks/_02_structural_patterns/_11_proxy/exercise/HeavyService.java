package rudaks._02_structural_patterns._11_proxy.exercise;

public class HeavyService {

    public void execute() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("executing heavy job...");
    }
}
