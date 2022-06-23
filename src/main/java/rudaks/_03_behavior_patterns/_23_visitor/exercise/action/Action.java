package rudaks._03_behavior_patterns._23_visitor.exercise.action;

import rudaks._03_behavior_patterns._23_visitor.exercise.user.User;

public interface Action {

    void accept(User user);
}
