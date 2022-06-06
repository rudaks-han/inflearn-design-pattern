package rudaks._01_creational_patterns._02_factory.execise.after;

public class Client {

    public static void main(String[] args) {
        CakeFactory cakeFactory = new ChocoCakeFactory();
        Cake cake = cakeFactory.order("choco", "rudaks94@mgail.com");
        System.out.println(cake);
    }
}
