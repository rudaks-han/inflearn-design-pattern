package rudaks._02_structural_patterns._09_decorator.exercise;

public class Milk implements Beverage {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void print() {
        beverage.print();
        System.out.println("add milk");
    }
}
