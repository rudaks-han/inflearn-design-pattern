package rudaks._03_behavior_patterns._22_template.exercise;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("차를 만든다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("아무것도 안함");
    }
}
