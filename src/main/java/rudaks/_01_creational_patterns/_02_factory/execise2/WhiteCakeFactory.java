package rudaks._01_creational_patterns._02_factory.execise2;

public class WhiteCakeFactory extends CakeFactory {
    @Override
    protected Cake createCake() {
        System.out.println("createCake: white");
        return new Cake("white");
    }
}
