package rudaks._02_structural_patterns._06_adapter.exercise;

public class Client {

    public static void main(String[] args) {
        // 드라이어를 110V에 연결
        Dryer dryer = new Dryer();
        connectTo110V(dryer);

        // 220V 청소기를 110V에 연결해보자.
        Cleaner cleaner = new Cleaner();
        SocketAdapter socketAdapter = new SocketAdapter(cleaner);
        connectTo110V(socketAdapter);
    }

    private static void connectTo110V(Electronic110V electronic110V) {
        electronic110V.connect();
    }
}
