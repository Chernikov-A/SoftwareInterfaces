package abstractions;

import abstractions.tast.DevelopingTask;

public interface Developer {
    void input(DevelopingTask task);
    boolean canDevelop();
}
