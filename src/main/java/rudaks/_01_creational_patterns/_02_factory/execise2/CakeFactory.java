package rudaks._01_creational_patterns._02_factory.execise2;

public abstract class CakeFactory {

    public Cake order(String name, String username) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }

        Cake cake = createCake();
        notifyTo(username);

        return cake;
    }

    protected abstract Cake createCake();

    private static void notifyTo(String username) {
        System.out.println("notify to " + username);
    }
}
