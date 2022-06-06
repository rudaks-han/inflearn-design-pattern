package rudaks._01_creational_patterns._02_factory.execise.after;

public class ChocoCakeFactory extends CakeFactory {
    @Override
    protected Cake createCake() {
        return new ChocoCake();
    }
}
