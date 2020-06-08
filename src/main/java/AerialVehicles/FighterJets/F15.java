package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;
import AerialVehicles.AttackMode;
import AerialVehicles.IntelligenceMode;
import Missions.Mission;


public class F15 extends AerialVehicle {
    AttackMode am;
    IntelligenceMode im;

    public F15(String sensorType, int numMissles, String missleType, String name, Mission mission,
               int numHoursToLastRepair, boolean readyToFly) {
        super(name, mission, numHoursToLastRepair, readyToFly);
        am = new AttackMode(numMissles, missleType);
        im = new IntelligenceMode(sensorType);
    }

    @Override
    public boolean isNeedsRepairing(int numHoursToLastRepair) {
        return numHoursToLastRepair >= 250;
    }

    public String attack() { return am.attack(name, "F15", mission); }

    public String collectIntelligence() {
        return im.collectIntelligence(name, "F15", mission);
    }
}
