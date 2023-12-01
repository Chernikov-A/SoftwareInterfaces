package implementations.task;

import abstractions.tast.DevelopingTask;

public class FrontendTask extends DevelopingTask {
    @Override
    public String getDetails() {
        return "Задача по разработке Серверного API";
    }
}
