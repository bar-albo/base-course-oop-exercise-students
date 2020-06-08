package Missions;

import Entities.Coordinates;


public abstract class Mission implements MissionService {
    private Coordinates dest;

    public Mission(Coordinates dest) {
        this.dest = dest;
    }

    public Coordinates getDestination() {
        return dest;
    }
}
