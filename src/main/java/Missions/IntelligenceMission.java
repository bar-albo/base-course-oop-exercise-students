package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission {
    private String region;

    public IntelligenceMission(String region, Coordinates dest) {
        super(dest);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
