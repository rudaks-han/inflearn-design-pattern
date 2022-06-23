package rudaks._03_behavior_patterns._23_visitor.exercise.user;

import rudaks._03_behavior_patterns._23_visitor.exercise.action.RegisterAction;
import rudaks._03_behavior_patterns._23_visitor.exercise.action.ResolveAction;

public class Assignee implements User {

    @Override
    public void transition(RegisterAction registerAction) {
        System.out.println("Assignee register");
    }

    @Override
    public void transition(ResolveAction resolveAction) {
        System.out.println("Assignee resolve");
    }
}
