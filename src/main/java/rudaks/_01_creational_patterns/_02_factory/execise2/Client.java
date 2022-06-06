package rudaks._01_creational_patterns._02_factory.execise2;

public class Client {

    public static void main(String[] args) {
        WhiteCakeFactory whiteCakeFactory = new WhiteCakeFactory();
        Cake cake = whiteCakeFactory.order("choco", "rudaks");
        System.out.println(cake);
    }
}
