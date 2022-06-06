package rudaks._01_creational_patterns._02_factory.execise2;

public class ChocoCakeFactory extends CakeFactory {
    @Override
    protected Cake createCake() {
        System.out.println("createCake: choco");
        return new Cake("choco");
    }
}
