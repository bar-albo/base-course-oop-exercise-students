package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {
    private String objective;

    public BdaMission(String objective, Coordinates dest) {
        super(dest);
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }
}
