package AerialVehicles;

import Missions.BdaMission;

import Missions.Mission;

public class BdaMode implements AerialBdaVehicle {
    String cameraType;

    public BdaMode(String cameraType) {
        this.cameraType = cameraType;
    }

    @Override
    public String performBda(String pilotName, String vehicleName, Mission mission) {
        if (mission instanceof BdaMission) {
            String objective = ((BdaMission) mission).getObjective();
            return String.format("%s: %s taking pictures of %s with: %s camera", pilotName, vehicleName, objective, cameraType);
        }
        return null;
    }
}
