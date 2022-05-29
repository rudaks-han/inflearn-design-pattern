package rudaks._01_creational_patterns._02_factory._02_after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteshipFactory().orderShip("whiteship", "rudaks94@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }
}
