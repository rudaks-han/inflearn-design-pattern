package rudaks._03_behavior_patterns._22_template.exercise;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("커피를 만든다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕을 넣는다.");
    }
}
