package rudaks._03_behavior_patterns._23_visitor.exercise;

import rudaks._03_behavior_patterns._23_visitor.exercise.action.Action;
import rudaks._03_behavior_patterns._23_visitor.exercise.action.RegisterAction;
import rudaks._03_behavior_patterns._23_visitor.exercise.user.Customer;
import rudaks._03_behavior_patterns._23_visitor.exercise.user.User;

public class Client {

    public static void main(String[] args) {
        // Action = Shape
        // User = Device
        Action action = new RegisterAction();
        User customer = new Customer();
        action.accept(customer);
    }
}
