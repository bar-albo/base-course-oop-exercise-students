package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialVehicle;
import AerialVehicles.BdaMode;
import AerialVehicles.IntelligenceMode;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends AerialVehicle {
    IntelligenceMode im;
    BdaMode bm;

    public Zik(String cameraType, String sensorType, String name, Mission mission,
               int numHoursToLastRepair, boolean readyToFly) {
        super(name, mission, numHoursToLastRepair, readyToFly);
        im = new IntelligenceMode(sensorType);
        bm = new BdaMode(cameraType);
    }

    @Override
    public boolean isNeedsRepairing(int numHoursToLastRepair) {
        return numHoursToLastRepair >= 100;
    }

    public String collectIntelligence() {
        return im.collectIntelligence(name, "Zik", mission);
    }

    public String preformBda() {
        return bm.performBda(name, "Zik", mission);
    }
}
