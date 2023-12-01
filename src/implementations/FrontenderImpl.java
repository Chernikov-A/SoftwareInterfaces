package implementations;

import abstractions.Frontender;
import abstractions.tast.DevelopingTask;
import implementations.result.Gui;
import implementations.task.FrontendTask;

public class FrontenderImpl implements Frontender {
    private FrontendTask task;
    @Override
    public void input(DevelopingTask developingTask) {
        if (developingTask instanceof  FrontendTask frontendTask){
            task = frontendTask;
        }
    }

    @Override
    public boolean canDevelop() {
        return task != null;
    }

    @Override
    public Gui developGui() {
        if (canDevelop()){
            return new Gui(){
              //...
            };
        }
        return null;
    }
}
