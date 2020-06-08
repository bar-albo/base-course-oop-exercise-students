package AerialVehicles;

import Missions.IntelligenceMission;
import Missions.Mission;

public class IntelligenceMode implements AerialIntelligenceVehicle {
    String sensorType;

    public IntelligenceMode(String sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public String collectIntelligence(String pilotName, String vehicleName, Mission mission) {
        if (mission instanceof IntelligenceMission) {
            String region = ((IntelligenceMission) mission).getRegion();
            return String.format("%s: %s Collecting Data in %s with sensor type: %s", pilotName, vehicleName, region, sensorType);
        }
        return null;
    }
}
