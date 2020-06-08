package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;
import AerialVehicles.AttackMode;
import AerialVehicles.BdaMode;
import AerialVehicles.IntelligenceMode;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends AerialVehicle {
    AttackMode am;
    IntelligenceMode im;
    BdaMode bm;

    public Shoval(String cameraType, int numMissles, String missleType, String sensorType, String name, Mission mission,
               int numHoursToLastRepair, boolean readyToFly) {
        super(name, mission, numHoursToLastRepair, readyToFly);
        am = new AttackMode(numMissles, missleType);
        im = new IntelligenceMode(sensorType);
        bm = new BdaMode(cameraType);
    }

    @Override
    public boolean isNeedsRepairing(int numHoursToLastRepair) {
        return numHoursToLastRepair >= 150;
    }

    public String attack() {
        return am.attack(name, "Shoval", mission);
    }

    public String collectIntelligence() {
        return im.collectIntelligence(name, "Shoval", mission);
    }

    public String preformBda() {
        return bm.performBda(name, "Shoval", mission);
    }
}

