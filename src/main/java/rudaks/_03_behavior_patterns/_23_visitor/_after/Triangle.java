package rudaks._03_behavior_patterns._23_visitor._after;

public class Triangle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
