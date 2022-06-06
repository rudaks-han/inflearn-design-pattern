package rudaks._01_creational_patterns._02_factory.execise.before;

public class CakeFactory {

    public static Cake order(String name, String email) {
        validate(name);
        Cake cake = createCake(name);
        notifyTo(email);

        return cake;
    }

    private static void notifyTo(String email) {
        System.out.println("케이크가 만들어졌습니다 : " + email);
    }

    private static Cake createCake(String name) {
        if ("choco".equals(name)) {
            return new Cake("choco");
        } else if ("white".equals(name)) {
            return new Cake("white");
        } else {
            throw new IllegalArgumentException(name + " is not supported");
        }
    }

    private static void validate(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
    }
}
