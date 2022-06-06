package rudaks._01_creational_patterns._02_factory.execise.before;

public class Client {

    public static void main(String[] args) {
        Cake cake = CakeFactory.order("choco", "rudaks94@mgail.com");
        System.out.println(cake);
    }
}
