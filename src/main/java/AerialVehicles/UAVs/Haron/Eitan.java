package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;
import AerialVehicles.AttackMode;
import AerialVehicles.IntelligenceMode;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends AerialVehicle {
    AttackMode am;
    IntelligenceMode im;

    public Eitan(int numMissles, String missleType, String sensorType, String name, Mission mission,
               int numHoursToLastRepair, boolean readyToFly) {
        super(name, mission, numHoursToLastRepair, readyToFly);
        am = new AttackMode(numMissles, missleType);
        im = new IntelligenceMode(sensorType);
    }

    @Override
    public boolean isNeedsRepairing(int numHoursToLastRepair) {
        return numHoursToLastRepair >= 150;
    }

    public String attack() {
        return am.attack(name, "Eitan", mission);
    }

    public String collectIntelligence() {
        return im.collectIntelligence(name, "Eitan", mission);
    }
}
