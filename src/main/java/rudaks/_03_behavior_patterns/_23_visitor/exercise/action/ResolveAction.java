package rudaks._03_behavior_patterns._23_visitor.exercise.action;

import rudaks._03_behavior_patterns._23_visitor.exercise.user.User;

public class ResolveAction implements Action {

    @Override
    public void accept(User user) {
        user.transition(this);
    }
}
