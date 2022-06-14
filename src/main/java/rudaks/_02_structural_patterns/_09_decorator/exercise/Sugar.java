package rudaks._02_structural_patterns._09_decorator.exercise;

public class Sugar implements Beverage {

    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void print() {
        beverage.print();
        System.out.println("add sugar");
    }
}
