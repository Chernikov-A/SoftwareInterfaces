package implementations;

import abstractions.Backender;
import abstractions.tast.DevelopingTask;
import implementations.result.ServerApi;
import implementations.task.BackendTask;

public class BackenderIml implements Backender {
    private BackendTask task;


    @Override
    public ServerApi develoServerApi() {
        if (canDevelop()){
            return new ServerApi(){
              //...
            };
        }
        return null;
    }

    @Override
    public void input(DevelopingTask developingTask) {
        if (developingTask instanceof BackendTask backendTask){
            task = backendTask;
        }

    }

    @Override
    public boolean canDevelop() {
        return task != null;
    }
}
