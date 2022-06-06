package rudaks._01_creational_patterns._02_factory.execise.after;

public abstract class CakeFactory {

    public Cake order(String name, String email) {
        validate(name);
        Cake cake = createCake();
        notifyTo(email);

        return cake;
    }

    private void notifyTo(String email) {
        System.out.println("케이크가 만들어졌으니 가져가세요 : " + email);
    }

    protected abstract Cake createCake();

    private static void validate(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
    }
}
