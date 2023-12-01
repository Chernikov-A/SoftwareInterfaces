package implementations.task;

import abstractions.tast.DevelopingTask;

public class BackendTask extends DevelopingTask {
    @Override
    public String getDetails() {
        return "Задача по разработке Серверного API";
    }
}
