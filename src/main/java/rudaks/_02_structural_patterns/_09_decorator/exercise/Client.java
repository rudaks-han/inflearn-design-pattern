package rudaks._02_structural_patterns._09_decorator.exercise;

public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);
        beverage.print();
    }
}
