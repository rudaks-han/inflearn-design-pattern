package rudaks._03_behavior_patterns._22_template.exercise;

public abstract class Beverage {

    public void request() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("물을 끓인다");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("컵에 따른다.");
    }

    protected abstract void addCondiments();
}
