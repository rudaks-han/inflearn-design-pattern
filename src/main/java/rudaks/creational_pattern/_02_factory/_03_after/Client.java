package rudaks.creational_pattern._02_factory._03_after;

public class Client {

    public static void main(String[] args) {
        new WhiteshipFactory().orderShip("white", "rudaks94@gmail.com");
        new BlackshipFactory().orderShip("black", "rudaks94@gmail.com");
    }
}
