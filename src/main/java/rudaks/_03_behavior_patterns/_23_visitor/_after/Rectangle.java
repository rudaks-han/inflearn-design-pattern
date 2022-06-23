package rudaks._03_behavior_patterns._23_visitor._after;

public class Rectangle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
