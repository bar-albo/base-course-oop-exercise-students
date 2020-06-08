package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialVehicle;
import AerialVehicles.AttackMode;
import AerialVehicles.BdaMode;
import AerialVehicles.IntelligenceMode;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends AerialVehicle {
    AttackMode am;
    IntelligenceMode im;
    BdaMode bm;

    public Kochav(int numMissles, String missleType, String cameraType, String sensorType,
                  String name, Mission mission, int numHoursToLastRepair, boolean readyToFly) {
        super(name, mission, numHoursToLastRepair, readyToFly);
        am = new AttackMode(numMissles, missleType);
        im = new IntelligenceMode(sensorType);
        bm = new BdaMode(cameraType);
    }

    @Override
    public boolean isNeedsRepairing(int numHoursToLastRepair) {
        return numHoursToLastRepair >= 100;
    }

    public String attack() {
        return am.attack(name, "Kochav", mission);
    }

    public String collectIntelligence() {
        return im.collectIntelligence(name, "Kochav", mission);
    }

    public String preformBda() {
        return bm.performBda(name, "Kochav", mission);
    }
}
