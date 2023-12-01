package abstractions;

import implementations.result.ServerApi;

public interface Backender extends Developer {
    ServerApi develoServerApi();

}
