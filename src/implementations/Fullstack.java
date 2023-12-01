package implementations;

import abstractions.Backender;
import abstractions.Frontender;
import abstractions.tast.DevelopingTask;
import implementations.result.Gui;
import implementations.result.ServerApi;
import implementations.task.BackendTask;
import implementations.task.FrontendTask;

public class Fullstack implements Backender, Frontender {
    private final Backender backender;

    private final Frontender frontender;

    public Fullstack() {
        backender = new BackenderIml();
        frontender = new FrontenderImpl();
    }

    @Override
    public ServerApi develoServerApi() {
        return backender.develoServerApi();
    }

    @Override
    public void input(DevelopingTask task) {
        backender.input(null);
        frontender.input(null);
        if (task instanceof BackendTask backendTask){
            backender.input(backendTask);
        } else if (task instanceof FrontendTask frontendTask) {
            frontender.input(frontendTask);
        }
    }

    @Override
    public boolean canDevelop() {
        return frontender.canDevelop() || backender.canDevelop();
    }

    @Override
    public Gui developGui() {
        return frontender.developGui();
    }
}
