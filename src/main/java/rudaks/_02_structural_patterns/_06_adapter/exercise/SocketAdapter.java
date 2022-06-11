package rudaks._02_structural_patterns._06_adapter.exercise;

public class SocketAdapter implements Electronic110V {

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void connect() {
        electronic220V.connect();
    }
}
